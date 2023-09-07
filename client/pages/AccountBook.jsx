import { useState } from 'react';

import TransactionHistory from './TransactionHistory';
import FamilyList from '../components/FamilyList';
import GoBackHeader from '../components/GoBackHeader';
import { dummyFamily, dummyUser } from '../test/dummyData/user';

const AccountBook = props => {
  const [selectedUser, setSelectedUser] = useState(dummyUser.userId);

  return (
    <>
      <GoBackHeader title={`${dummyFamily.familyName}이네 가계부`} />
      <FamilyList />
      {/* 캘린더 */}
      <></>
      {/* 소비 내역 요약  */}
      <></>
      {/* 일일 피드백 */}
      <></>
      {/* 일일 거래 내역 조회 */}
      {/* <TransactionList data={} /> */}
    </>
  );
};

export default AccountBook;
