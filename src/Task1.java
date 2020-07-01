import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Task1 {
    private static final Logger LOGGER = Logger.getLogger(Task1.class);
    private int[] masivIndex;
    private int[] masivWeigth;

    public Task1(int[] masivIndex, int[] masivWeigth) {
        PropertyConfigurator.configure("log4j.properties");
        this.masivIndex = masivIndex;
        this.masivWeigth = masivWeigth;
    }

                                                                    //Solutia  din internet

    public void retIndexWithWeigth(){
        double summ = Arrays.stream(masivWeigth).sum();
        int randomIndex = -1;
        double random1 = Math.random()* summ;
        for (int i = 0; i < masivWeigth.length ; i++) {
            random1 -= masivWeigth[i];
    if (random1 <= 0){
        randomIndex = i;
        break;
    }
        }

        LOGGER.info(randomIndex+1+" Подсмотрено))");
    }
        //*****************************************************//Solutia proprie
    public void returnIndexWithWeigth(){
        ArrayList<Integer> index = new ArrayList<>();

        for (int j = 0; j < masivIndex.length;j++) {
            for (int i = 0; i < masivWeigth[j]; i++) {
                index.add(masivIndex[j]);
            }
        }                                                     //Add in variable index all indexes

        Random random = new Random();
        int randomIndex = random.nextInt(index.size());       //Random number between 0 and all indexes

        LOGGER.info(index.get(randomIndex)+ " ");             //Print random index
    }

}
