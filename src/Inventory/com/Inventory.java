package Inventory.com;
import java.util.*;


  public class Inventory<T> {
      private List<T> items;

      public Inventory(){
          items = new ArrayList<>();
      }

      public void addItem(T item){
          items.add(item);
          System.out.println("✅ Your item added successfully" + item);
      }

      public void removeItem(T item){
          if(items.remove(item)){
              System.out.println("✅ Item removed successfully" + item);
          }else{
              System.out.println("❌ Error no item foung");
          }
      }

      public void viewItem(){
         if(items.isEmpty()){
             System.out.println("❌ No item found in List");
         }
         else{
             for( T i : items){
                 System.out.println("Item in Inventory Are:-- 📋");
                 System.out.println(i);
             }
         }
      }

      public List<T> getItems() {
          return items;
      }
  }
