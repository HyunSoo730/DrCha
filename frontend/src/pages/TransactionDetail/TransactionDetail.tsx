import { useEffect, useState } from 'react';
import { useParams } from 'react-router-dom';

import { Navbar } from '@/components/Navbar/Navbar';
import { iou } from '@/services/iou';
import { transaction } from '@/services/transaction';
import { TransactionDetailHistory } from '@/types/history';
import { IouDetailData } from '@/types/iou';

import { Header } from './Header';
import { TransactionAlarm } from './TransactionAlarm';
import styles from './TransactionDetail.module.scss';
import { TransactionGraph } from './TransactionGraph';
import { TransactionHistories } from './TransactionHistories';
import { TransactionTitle } from './TransactionTitle';

export function TransactionDetail() {
  const { type, iouId } = useParams<{ type: string; iouId: string }>();
  const [curData, setCurData] = useState<IouDetailData | null>(null);
  const [curHistory, setCurHistory] = useState<Array<TransactionDetailHistory>>(
    [],
  );
  const [isLoading, setIsLoading] = useState(true);
  const [error, setError] = useState<string | null>(null);
  const [types, setTypes] = useState<string>(' ');

  useEffect(() => {
    const fetchData = async () => {
      setIsLoading(true);
      setError(null);
      try {
        if (!iouId) {
          throw new Error('IOU ID is missing');
        }
        let data: IouDetailData;
        let historydata: Array<TransactionDetailHistory> = [];
        if (type === 'lend') {
          setTypes('lend');
          data = await iou.getLendingDetail(iouId);
        } else if (type === 'borrow') {
          setTypes('borrow');
          data = await iou.getBorrowingDetail(iouId);
        } else {
          throw new Error('Invalid transaction type');
        }
        historydata = await transaction.getDetailHistories(iouId);
        setCurData(data);
        setCurHistory(historydata);
      } catch (err) {
        setError(
          err instanceof Error ? err.message : 'An unknown error occurred',
        );
      } finally {
        setIsLoading(false);
      }
    };

    fetchData();
  }, [type, iouId]);

  if (isLoading) {
    return <div>Loading...</div>;
  }

  if (error) {
    return <div>Error: {error}</div>;
  }

  if (!curData) {
    return <div>No data available</div>;
  }

  return (
    <div className={styles.container}>
      <Header />
      <TransactionTitle types={types} curiou={curData} />
      {types === 'lend' && <TransactionAlarm />}
      <TransactionHistories
        types={types}
        curiou={curData}
        curhistory={curHistory}
      />
      <TransactionGraph types={types} curiou={curData} />
      <Navbar />
    </div>
  );
}
