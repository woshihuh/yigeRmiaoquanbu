package com.spring.utils;


public class TransactionManager {

    private ConnectionUtils connectionUtils;

    public void setConnectionUtils(ConnectionUtils connectionUtils) {
        this.connectionUtils = connectionUtils;
    }

    public void BeginTransaction(){
      try{
          connectionUtils.getThreadConnection().setAutoCommit(false);
      }catch (Exception e){
          e.printStackTrace();
      }
    }
    public void commit(){
        try{
            connectionUtils.getThreadConnection().commit();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void rollback(){
        try{
            connectionUtils.getThreadConnection().rollback();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void release(){
        try{
          connectionUtils.getThreadConnection().close();
          connectionUtils.removeConnection();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
