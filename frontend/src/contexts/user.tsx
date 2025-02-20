import { createContext, useCallback, useEffect, useState } from 'react';

import { member } from '@/services/member';
import { Info } from '@/types/Member';

interface UserProps {
  isLogin: boolean;
  setIsLogin: React.Dispatch<React.SetStateAction<boolean>>;
  userInfo: Info | undefined;
  setUserInfo: React.Dispatch<React.SetStateAction<Info | undefined>>;
  getMyInfo: () => Promise<void>;
}

type UserProviderProps = {
  children: React.ReactNode;
};

export const UserContext = createContext<UserProps | undefined>(undefined);

export function UserProvider({ children }: UserProviderProps) {
  const [isLogin, setIsLogin] = useState(true);
  const [userInfo, setUserInfo] = useState<Info | undefined>();

  const getMyInfo = useCallback(async () => {
    try {
      const myInfo = await member.getMemberInfo();
      setUserInfo(myInfo);
      setIsLogin(true);
    } catch {
      setUserInfo(undefined);
      setIsLogin(false);
    }
  }, []);

  useEffect(() => {
    getMyInfo();
  }, [getMyInfo]);

  return (
    <UserContext.Provider
      // eslint-disable-next-line react/jsx-no-constructed-context-values
      value={{ isLogin, setIsLogin, userInfo, setUserInfo, getMyInfo }}
    >
      {children}
    </UserContext.Provider>
  );
}
