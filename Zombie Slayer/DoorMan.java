public class DoorMan extends Thread{
    ZombieCounter zc;
    public DoorMan(ZombieCounter zombieCounter) { 
        this.zc = zombieCounter;
    }

    @Override
    public void run(){
       while(!zc.tooManyZombiesInTheRoom() && !zc.killed100Zombies()){
            double r = Math.random();// 0-1
            if(r<0.5){
                zc.zombieEntered();
            }
            try{
            Thread.sleep(2000);
            }
        catch(InterruptedException e){
                e.printStackTrace();
            }
       }    
    }
}
