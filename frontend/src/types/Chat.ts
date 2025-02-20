export type ChatRoom = {
  chatRoomId: number;
  name: string;
  avatarUrl: string;
  contractStatus: 'DRAFTING' | 'ACTIVE' | 'COMPLETED' | 'OVERDUE' | 'CANCELLED';
  lastMessage: string;
  iouAmount: number;
  daysUntilDue: number;
  unreadCount: number;
  memberTrustInfoResponse: {
    lateTrades: number;
    debtTrades: number;
    completedTrades: number;
    message: string;
  };
  member: boolean;
};

export type ChatRoomSummary = {
  chatRoomId: number;
  creditorId: number;
  debtorId: number;
  opponentName: string;
  lastMessageId?: number;
  lastMessage?: string;
  lastMessageTime?: string;
  unreadCount: number;
  memberRole: 'DEBTOR' | 'CREDITOR';
};
