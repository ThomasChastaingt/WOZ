import java.util.Random;

/**
 * Décrivez votre classe Robot ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class RandomRobot extends RobotG
{

    /**
     * Constructeur d'objets de classe Robot
     */
    public RandomRobot(String nameRobot, int dir, int x, int y)
    {
        super(nameRobot,dir,x,y);
    }
    /**
     * Ce projet n'est pas tr�s tr�s tr�s bon, a revoir 
     */
    public void avancer()  {
        Random random = new Random();
         int newDirection = random.nextInt(4); // Donne une direction aléatoire
        setDirection(newDirection); // Change la direction du robot en fonction de la direction alétoire
        
        int distance = random.nextInt(12); //Génère une distance aléatoire entre 0 et la taille du canvas
        
        for (int i = 0; i < distance; i++) { //Boucle répétant distance fois la fonction avancer de la classe Robot
            super.avancer(); // Appelle la méthode avancer de la classe (RobotG)
        }
    }
    
}