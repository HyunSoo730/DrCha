export const URL = {
  API: import.meta.env.VITE_API_URL,
  API_LOCAL: import.meta.env.VITE_API_URL_LOCAL,
  LOGIN:
    import.meta.env.MODE === 'development'
      ? `${import.meta.env.VITE_API_URL_LOCAL}/api`
      : import.meta.env.VITE_API_URL_LOGIN,
  INVITE:
    import.meta.env.MODE === 'development'
      ? import.meta.env.VITE_API_URL_FRONT
      : import.meta.env.VITE_API_URL,
};
