package bookproject;

import java.util.Scanner;
import java.util.ArrayList;

public class BookManager  {

  Scanner sc = new Scanner(System.in);
  Book[] books = new Book[10000];

 
  int menu = 0;  // ���� ���� �������� ���� ��ȣ
  int count = 1;

 
  public void bookAdd() { // 1�� ���� ���
 
      System.out.println("1.���� ���� ���");
      String bookTitle = getData("����� ������ ������ �Է����ּ���(��, ���� ���� �Է��Ͻÿ�)  :");
      String bookAuthor = getData("����� ������ ���ڸ� �Է����ּ���(��, ���� ���� �Է��Ͻÿ�) : ");
     
      for(int i = 0; i < books.length; i++){
      //���� ����� �� �� ���� ī��Ʈ
          if(books[i] == null){
         
              count = i+1;
              books[i] = new Book(count,bookTitle,bookAuthor);
              //count, ����, �۰��� ���� ����
              System.out.println("��ϿϷ�");
              break;
          }
      }
  }

  public void bookSearch(){  // 2.���� ID�� ���� �˻�
 
      System.out.println("2. ���� ID �˻�");

      int bookID = getSelectNum("�˻��Ͻ� ������ ID ��ȣ�� �Է����ּ���:");
     
      Book ID =  findBook(bookID);
      if(ID == null) {
         System.out.println("�Է��Ͻ� ID��ȣ�� ���������ʽ��ϴ�.");
         return;
      }else {  // ���� ���̵��ȣ�� ��ȿ�ϴٸ� �� ���̵� ��ȣ�� ��� ���
         BookList(ID);
      }
  }

  public void bookEdit() { // 3 ���� ���� ����
 
      System.out.println("3. ���� ���� ����");
      int bookID = getSelectNum("������ ������ ID ��ȣ�� �Է��ϼ��� > ");
     
      Book ID = findBook(bookID);
      if(ID == null) {
     
          System.out.println("�Է��Ͻ� ID ��ȣ�� å�� �������� �ʽ��ϴ�.");
          return;
      }
     
      boolean isUpdate = true;
     
      while(isUpdate) {
     
          System.out.println("==========���� ���� ����==========");
          System.out.println("1. ���� ���� | 2. ���� ���� | 3. ���� �Ϸ�");
          System.out.println("==============================");
         
          menu = getSelectNum("�����Ͻ� ������ ID ��ȣ�� �Է����ּ���:");
         
          switch(menu) {
         
          case 1 :
              String bookTitle = getData("������ �������ּ���:");
              ID.setBookTitle(bookTitle);
              System.out.println("���� ���� �Ϸ� ");
              break;
             
          case 2 :
              String bookAuthor = getData("���� �̸��� �������ּ��� :");
              ID.setBookAuthor(bookAuthor);
              System.out.println("���� �̸� �����Ϸ�");
              break;
          case 3 :
              System.out.println("���� �޴� ����");
              isUpdate = false;
              break;
          }
      }
  }

  public void bookDelete() {// 4 ���� ����
      System.out.println("4. ���� ���� ����");
      int bookID = getSelectNum("������ ������ ID��ȣ�� �Է��ϼ���.");
     
      Book ID = findBook(bookID);
     
      if(ID == null) {
          System.out.println("�Է��Ͻ� ID��ȣ�� å�� �������� �ʽ��ϴ�.");
          return;
      }
     
      for(int i = 0; i < books.length; i++){
          if(books[i] != null && books[i].getBookID() == bookID){ // �迭�� ���� �����ϰ� bookID�� ������ null(��������)
              books[i] = null;
              System.out.println("���� �Ϸ�");
              return;
          }
      }
  }  //���� ���� �޴� 1-4�� ��

 
  public void BookList(Book ID) {
 
      System.out.println(ID.toString());
  }  //2�� ���� ID�˻����� ID�� �����ҽ� ����Ʈ ���

  public Book findBook(int ID){
 
      for(int i = 0; i< books.length; i++){
     
          if(books[i] != null && books[i].getBookID() == ID){
           // books �迭�� ���� �����ϰ�  getBookID�� ���� ID�� ������ �� ��ȯ
              return books[i];
          }
      }
     
      return null;
  }

 String getData(String message){
 
      System.out.println(message);
      return sc.next();
  }

  int getSelectNum(String message) {
     
      System.out.println(message);
      return sc.nextInt();
  }

}