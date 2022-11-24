import java.util.*;
public class TicTacToe {

    // Défintion du scanner, permettant de lire les entrées clavier
    static final Scanner input = new Scanner(System.in);
    // Définition du tableau de jeu
    static char[][] tab = {{' ',' ',' '}, {' ',' ',' '}, {' ',' ',' '} };

    static boolean prise = false;
    public static void main(String[] args){
        System.out.print("\nJoueur 1 = X : Joueur 2 = 0 \n");
        affichageTab(tab);      
        int nbTour = 0 ; 
        int emplacement = 0;
        int emplacement2 = 0;
        int emplacementJ2 = 0;
        int emplacement4 = 0;


        do{

            do{
                System.out.print("\nJoueur 1 : choisissez votre emplacement (1-9) : ");
                emplacement = input.nextInt();   
                if(emplacement < 1 || emplacement > 9){
                    System.out.print("\nErreur : Saisie invalide !\n");
                }
            }while(emplacement < 1 || emplacement > 9);
            // System.out.print("\nJoueur 1 : choisissez votre emplacement (1-9) : ");
            // int emplacement = input.nextInt();
            int[] convertion = ValToColRow(emplacement);
            System.out.println(convertion[0] + " " + convertion[1]);

            if(tab[convertion[0]][convertion[1]] == ' '){
                tab [convertion[0]][convertion[1]] = 'X';
                affichageTab(tab);
                nbTour += 1;
                if (verifTab(tab) == true){
                    System.out.println("Félicitations, le joueur 1 a gagné !");
                    break;
                }
                if (nbTour == 9){
                    System.out.println("Match nul !");
                    return;
                }
            }

            else{
                prise = true;
                while(prise = true ){
                    // System.out.print("\nJoueur 1 : choisissez votre emplacement (1-9) : ");
                    // emplacement2 = input.nextInt();
                    System.out.print("\nCase déjà prise !\n");
                    do{
                        System.out.print("\nJoueur 1 : choisissez votre emplacement (1-9) : ");
                        emplacement2 = input.nextInt();   
                        if(emplacement2 < 1 || emplacement2 > 9){
                            System.out.print("\nErreur : Saisie invalide !\n");
                        }
                    }while(emplacement2 < 1 || emplacement2 > 9);
                    int[] convertion3 = ValToColRow(emplacement2);
                    if(tab[convertion3[0]][convertion3[1]] == ' ' ){
                        tab[convertion3[0]][convertion3[1]] = 'X';
                        affichageTab(tab);
                        nbTour += 1;
                        if (verifTab(tab) == true){
                            System.out.println("Félicitations, le joueur 1 a gagné !");
                            break;
                        }
                        if (nbTour == 9){
                            System.out.println("Match nul !");
                            return;
                        }
                        break;
                    }
                }
            }               

            {
            // System.out.print("\nJoueur 2 : choisissez votre emplacement (1-9) : ");
            // int emplacementJ2 = input.nextInt();
            do{
                System.out.print("\nJoueur 2 : choisissez votre emplacement (1-9) : ");
                emplacementJ2 = input.nextInt();   
                if(emplacementJ2 < 1 || emplacementJ2 > 9){
                    System.out.print("\nErreur : Saisie invalide !\n");
                }
            }while(emplacementJ2 < 1 || emplacementJ2 > 9);

            int[] convertion2 = ValToColRow(emplacementJ2);
            System.out.println(convertion2[0] + " " + convertion2[1]);
            

            if(tab[convertion2[0]][convertion2[1]] == ' '){
                tab [convertion2[0]][convertion2[1]] = '0';
                affichageTab(tab);
                nbTour += 1;
                if (verifTab(tab) == true){
                    System.out.println("Félicitations, le joueur 2 a gagné !");
                    break;
                }
                if (nbTour == 9){
                    System.out.println("Match nul !");
                    return;
                }
            }
            else{
                prise = true;
                while(prise = true){
                    // System.out.print("\nJoueur 2 : choisissez votre emplacement (1-9) : ");
                    // int emplacement4 = input.nextInt();
                    System.out.print("\nCase déjà prise !\n");
                    do{
                        System.out.print("\nJoueur 2 : choisissez votre emplacement (1-9) : ");
                        emplacement4 = input.nextInt();   
                        if(emplacement4 < 1 || emplacement4 > 9){
                            System.out.print("\nErreur : Saisie invalide !\n");
                        }
                    }while(emplacement4 < 1 || emplacement4 > 9);

                    int[] convertion6 = ValToColRow(emplacement4);

                    if(tab[convertion6[0]][convertion6[1]] ==' '){
                        tab[convertion6[0]][convertion6[1]] = '0';
                        nbTour += 1;
                        affichageTab(tab);
                        if (verifTab(tab) == true){
                            System.out.println("Félicitations, le joueur 2 a gagné !");
                            break;
                        }
                        if (nbTour == 9){
                            System.out.println("Match nul !");
                            break;
                        }
                        break;
                    }
                }
            }   
            

        }       
        }while(verifTab(tab) == false); 
    }

    static boolean verifTab(char[][] tab){
        if (tab[0][0] == tab[0][1] && tab[0][0] == tab[0][2] && tab[0][0] != ' '){
            return true;
        }
        else if (tab[1][0] == tab[1][1] && tab[1][0] == tab[1][2] && tab[1][0] != ' '){
            return true;
        }
        else if (tab[2][0] == tab[2][1] && tab[2][0] == tab[2][2] && tab[2][0] != ' '){
            return true;
        }
        else if (tab[0][0] == tab[1][0] && tab[0][0] == tab[2][0] && tab[0][0] != ' '){
            return true;
        }
        else if (tab[0][1] == tab[1][1] && tab[0][1] == tab[2][1] && tab[0][1] != ' '){
            return true;
        }
        else if (tab[0][2] == tab[1][2] && tab[0][2] == tab[2][2] && tab[0][2] != ' '){
            return true;
        }
        else if (tab[0][0] == tab[1][1] && tab[0][0] == tab[2][2] && tab[0][0] != ' '){
            return true;
        }
        else if (tab[0][2] == tab[1][1] && tab[0][2] == tab[2][0] && tab[0][2] != ' '){
            return true;
        }
        else{
            return false;
        }
    }



    public static int[]  ValToColRow(int emplacement){

        int ligne = 0;
        int colonne = 0;
        int[] convert = new int[2];       


        if (emplacement <=3){
            ligne = 0;
            colonne = emplacement-1;
            int[] convert1 = {ligne,colonne};            
            return  convert1;
        }

        else if (emplacement > 3 && emplacement <= 6){
            ligne = 1;
            colonne = emplacement-4;
            int[] convert2 = {ligne,colonne};            
            return  convert2;
        }

        else if (emplacement > 6 && emplacement <= 9){
            ligne = 2;
            colonne = emplacement-7;
            int[] convert3 = {ligne,colonne};            
            return  convert3;
        }

        return convert;      

    }

    public static void affichageTab(char[][] tab){ 
        System.out.println("\n");
        for(int i =0 ; i <= 2; i++){
            System.out.print("\t");
            for(int j = 0 ; j <= 2; j++){
                System.out.print(tab[i][j] + "\t" + "|" + "\t");
                if( j == 2){
                    System.out.println("\n");
                }
            }
        }    
    }

}
