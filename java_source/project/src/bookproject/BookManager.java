package bookproject;

import java.util.Scanner;
import java.util.ArrayList;

public class BookManager  {

  Scanner sc = new Scanner(System.in);
  Book[] books = new Book[10000];

 
  int menu = 0;  // 도서 정보 수정에서 쓰일 번호
  int count = 1;

 
  public void bookAdd() { // 1번 도서 등록
 
      System.out.println("1.도서 정보 등록");
      String bookTitle = getData("등록할 도서의 제목을 입력해주세요(단, 띄어쓰기 없이 입력하시오)  :");
      String bookAuthor = getData("등록할 도서의 저자를 입력해주세요(단, 띄어쓰기 없이 입력하시오) : ");
     
      for(int i = 0; i < books.length; i++){
      //도서 등록이 될 때 마다 카운트
          if(books[i] == null){
         
              count = i+1;
              books[i] = new Book(count,bookTitle,bookAuthor);
              //count, 제목, 작가의 값을 받음
              System.out.println("등록완료");
              break;
          }
      }
  }

  public void bookSearch(){  // 2.도서 ID를 통해 검색
 
      System.out.println("2. 도서 ID 검색");

      int bookID = getSelectNum("검색하실 도서의 ID 번호를 입력해주세요:");
     
      Book ID =  findBook(bookID);
      if(ID == null) {
         System.out.println("입력하신 ID번호가 존재하지않습니다.");
         return;
      }else {  // 만약 아이디번호가 유효하다면 그 아이디 번호의 목록 출력
         BookList(ID);
      }
  }

  public void bookEdit() { // 3 도서 정보 수정
 
      System.out.println("3. 도서 정보 수정");
      int bookID = getSelectNum("수정할 도서의 ID 번호를 입력하세요 > ");
     
      Book ID = findBook(bookID);
      if(ID == null) {
     
          System.out.println("입력하신 ID 번호의 책이 존재하지 않습니다.");
          return;
      }
     
      boolean isUpdate = true;
     
      while(isUpdate) {
     
          System.out.println("==========도서 정보 수정==========");
          System.out.println("1. 제목 수정 | 2. 저자 수정 | 3. 수정 완료");
          System.out.println("==============================");
         
          menu = getSelectNum("수정하실 도서의 ID 번호를 입력해주세요:");
         
          switch(menu) {
         
          case 1 :
              String bookTitle = getData("제목을 수정해주세요:");
              ID.setBookTitle(bookTitle);
              System.out.println("제목 수정 완료 ");
              break;
             
          case 2 :
              String bookAuthor = getData("저자 이름을 수정해주세요 :");
              ID.setBookAuthor(bookAuthor);
              System.out.println("저자 이름 수정완료");
              break;
          case 3 :
              System.out.println("수정 메뉴 종료");
              isUpdate = false;
              break;
          }
      }
  }

  public void bookDelete() {// 4 도서 삭제
      System.out.println("4. 도서 정보 삭제");
      int bookID = getSelectNum("삭제할 도서의 ID번호를 입력하세요.");
     
      Book ID = findBook(bookID);
     
      if(ID == null) {
          System.out.println("입력하신 ID번호의 책이 존재하지 않습니다.");
          return;
      }
     
      for(int i = 0; i < books.length; i++){
          if(books[i] != null && books[i].getBookID() == bookID){ // 배열의 값이 존재하고 bookID와 같으면 null(도서삭제)
              books[i] = null;
              System.out.println("삭제 완료");
              return;
          }
      }
  }  //도서 관리 메뉴 1-4번 끝

 
  public void BookList(Book ID) {
 
      System.out.println(ID.toString());
  }  //2번 도서 ID검색에서 ID가 존재할시 리스트 출력

  public Book findBook(int ID){
 
      for(int i = 0; i< books.length; i++){
     
          if(books[i] != null && books[i].getBookID() == ID){
           // books 배열의 값이 존재하고  getBookID의 값이 ID와 같으면 값 반환
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