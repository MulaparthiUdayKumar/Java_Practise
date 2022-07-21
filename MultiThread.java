class MultiThread extends Thread
  {
    public void run()
    {
      for(int i=1;i<=10;i++)
        {
          if(i%2!=0)
          {
               System.out.println(i);
            try{
             Thread.sleep(1000);
             }
          catch(Exception e)
            {
              System.out.println(e);
            }
          }
       
         
        }
    }
    
  }
class MultiThread
  {
    public static void main(String args[])
    {
      MultiThread t=new MultiThread();
      MultiThread t1=new MultiThread();
      MultiThread t2=new MultiThread();
      t.start();
      try
        {
          t.join();
        }
      catch(Exception e)
            {
              System.out.println(e);
            }
      t1.start();
       try
        {
          t1.join();
        }
      catch(Exception e)
            {
              System.out.println(e);
            }
      t2.start();
       try
        {
          t2.join();
        }
      catch(Exception e)
            {
              System.out.println(e);
            }
      System.out.println(t.getName());
    }
  }