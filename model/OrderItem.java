package model;

import service.Biryani;

public class OrderItem {

   Biryani biryani;

   public Biryani getBiryani() {

      return biryani;
   }

   public void setBiryani(Biryani biryani) {

      this.biryani = biryani;
   }

   @Override
   public String toString() {

      return "OrderItem [biryani=" + biryani + "]";
   }
}







