import java.util.Scanner;

public class Baskin_Robbins {
   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      int mywin =0;
      int comwin=0;

      while(true) {
         try {
            System.out.println("Baskin Robbins31 Game");
            System.out.println();
            System.out.println("1. Game Stert");
            System.out.println("2. Game Score");
            System.out.println("3. End Game");
            System.out.print(">");

            int select = Integer.parseInt(sc.nextLine());

            int mynum =0;
            int comnum =0;

            switch(select) {
            case 1:
               he:      while(true) {
                  double com = (int)(Math.random()*3)+1;

                  System.out.println("<<  Game Start   >>");
                  System.out.print("Input Number(1~3) : ");
                  int my = Integer.parseInt(sc.nextLine());

                  // �� �Է�
                  if(my<4) {
                     for(int i=0; i < my; i++) {
                        mynum+=1;
                        System.out.println(mynum+"!");
                        if(mynum==31) {
                           System.out.println("31! ���� �й�");
                           comwin++;
                           System.out.println();
                           break he;
                        }else if(comnum==31) {
                           System.out.println("31! ���� �¸�");
                           mywin++;
                           System.out.println();
                           break he;
                        }
                     }
                  }else {
                     System.out.println("3�̻� �Ұ��մϴ�.");
                  }

                  // ��ǻ�� �Է�
                  if(com<4) {
                     System.out.println("<Computer Turn>"+com);
                     for(int i =0; i < com; i++) {
                        mynum+=1;
                        comnum=mynum;
                        System.out.println(comnum+"!");
                        if(comnum==31) {
                           System.out.println("31! ���� �¸�");
                           mywin++;
                           System.out.println();
                           break he;
                        }else if(mynum==31) {
                           System.out.println("31! ���� �й�");
                           comwin++;
                           System.out.println();
                           break he;
                        }
                     }
                     System.out.println();
                  }
               }
               break;
            case 2:
               System.out.println("<< ����� ���� >>");
               System.out.println(" WIN :"+ mywin);
               System.out.println(" LOSE :"+ comwin);
               System.out.println(" DRAW : 0");
               System.out.println();
               break;
            case 3:
               System.out.println("<< ���� ���� >>");
               System.exit(0);
               break;
            }
         }catch(Exception e) {
            System.out.println("���ڸ� �Է����ּ���!!");
         }
      }
   }
}