class FancyStoreUtil{
public static void main(String a[]){
FancyStore store=new FancyStore();
store.items[0]="NailPolish";
store.items[1]="Bangles";
store.items[2]="Necklace";
store.items[3]="Bindies";
store.items[4]="Lipsticks";
store.items[5]="perfumes";
FancyStore store1=new FancyStore("Laxmi Fancy Store","near Ram Mandir",store.items,918,"Rashmi",true);
store1.displayFancyStore();
store1.getitems();
}
}
