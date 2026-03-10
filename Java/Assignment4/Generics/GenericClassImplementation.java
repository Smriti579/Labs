class Box<T> {
    private T item;  
    public void addItem(T item) {
        this.item = item;
    }
    public T getItem() {
        return item;
    }
}
public class GenericBoxExample {
    public static void main(String[] args) {
        // Using Box with Integer type
        Box<Integer> intBox = new Box<>();
        intBox.addItem(42);
        System.out.println("Integer Box contains: " + intBox.getItem());
        Box<String> strBox = new Box<>();
        strBox.addItem("Hello Generics");
        System.out.println("String Box contains: " + strBox.getItem());
    }
}
