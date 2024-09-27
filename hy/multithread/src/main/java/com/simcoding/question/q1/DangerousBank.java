package com.simcoding.question.q1;

public class DangerousBank implements Bank {

    @Override
    public void transfer(BankAccount from, BankAccount to, int money){
        synchronized (from){
            if(from.getBalance() >= money){

                from.setBalance(from.getBalance() - money);
                notifyUserViaNetwork(from);
                synchronized (to){

                    to.setBalance(to.getBalance() + money);
                }

            }else{
                throw new RuntimeException("money is not enough");
            }
        }
    }
    /**
     * @apiNote 유저에게, 돈을 보낸다는 공지를 보낸다. 이때, IO가 발생하여, 호출 쓰레드는 잠시 Block 된다.
     * **/
    private void notifyUserViaNetwork(BankAccount from) {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class Experiment{

    public static void main(String[] args) {

        Bank bank = new DangerousBank();
        BankAccount a = new BankAccount(1);
        BankAccount b = new BankAccount(2);

        a.setBalance(100);
        b.setBalance(100);

        new Thread(()->{
           bank.transfer(a,b, 100);
        }).start();

        new Thread(()->{
            bank.transfer(b,a, 100);
        }).start();

    }

}