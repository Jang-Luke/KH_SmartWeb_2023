package exams01;

import java.util.Scanner;

public class Sense_01 {
   

   
   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      Movie[] movies = new Movie[5];
      
      int index = 0;
      while (true) {
         System.out.println("<< Netflix Simulator >>");
         System.out.println("1. �ű� ��ȭ ���");
         System.out.println("2. ��ȭ ��� ���");
         System.out.println("3. ��ȭ �˻� ( �������� �˻� )");
         System.out.println("4. ���� ���� ( �������� �˻� )");
         System.out.println("0. ����");
         System.out.print(">>>");

         int menu = Integer.parseInt(sc.nextLine());


         if (menu==1) {
            
            movies[index] = new Movie("Avatar","SF",9.0);
            index++;
            movies[index] = new Movie("����","Drama",10.0);
            index++;
            movies[index] = new Movie("���˵���2","Action",8.0);
            index++;
            
         }else if (menu == 2) {
            
            System.out.println("����\t�帣\t����");
            for(int i = 0;i < index;i++) {
               System.out.println(movies[i].getName() + "\t" + movies[i].getGan() + "\t" + movies[i].getStar());
            }
         }else if (menu == 3) {
            
            System.out.print("�˻��Ϸ��� ��ȭ ���� : ");
            String title = sc.nextLine();
            
            System.out.println("����\t�帣\t����");
            for(int i = 0; i < index; i++) {
               if(movies[i].getName().equals(title)) {
                  System.out.println(movies[i].getName() +"\t"+movies[i].getGan()+"\t"+movies[i].getStar());
               }
            }
            
         }else if (menu == 4) {
            
            System.out.print("�����ϰ��� �ϴ� ��ȭ ���� : ");
            String title = sc.nextLine();
            
            for(int i = 0;i < index;i++) {
               if(movies[i].getName().equals(title)) {
                  
                  System.out.print("������ ���� : ");
                  String updateTitle = sc.nextLine();
                  
                  System.out.print("������ �帣 : ");
                  String updateGenre = sc.nextLine();
                  
                  System.out.print("������ ���� : ");
                  double updateScore = Double.parseDouble(sc.nextLine());
                  
                  movies[i] = new Movie(updateTitle, updateGenre, updateScore);
                  break;
               }
            }
         }else if(menu == 5) {
            
            System.out.print("������ ��ȭ ���� : ");
            String title = sc.nextLine();
            
            for(int i = 0;i < index;i++) {
               if(movies[i].getName().equals(title)) {
                  for(int j = i;j < index;j++) {
                     if(j == index-1) {
                        movies[j] = null;
                        index--;
                        break;
                     }
                     movies[j] = movies[j+1];
                  }
                  break;
               }
            }
         }else if (menu == 0) {
            System.out.println("Netflix �� �����մϴ�.");
            System.exit(0);
         }else  {
            System.out.println("�߸� �Է��ϼ̽��ϴ�.");
         }
         continue;
      }



   }
}