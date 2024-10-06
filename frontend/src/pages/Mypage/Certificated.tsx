import CertificatedSVG from '@/assets/icons/certificated.svg?react';
import styles from '@/pages/Mypage/Mypage.module.scss';
import { MyInfo } from '@/types/MyInfo';

export function Certificated({ myInfos }: { myInfos: MyInfo }) {
  return (
    <div className={styles.card}>
      <div className={styles.bankinfo}>
        <div className={styles.bankinfodetail}>
          <div className={styles.bankname}>싸피은행</div>
          <div className={styles.accountnum}>{myInfos.accountNo}</div>
        </div>
        <div className={styles.certokay}>
          <div>
            <CertificatedSVG fill="#ffffff" />
            <span>본인 인증 완료</span>
          </div>
        </div>
      </div>
      <div className={styles.balance}>
        <span>{myInfos.balance}원</span>
      </div>
    </div>
  );
}
