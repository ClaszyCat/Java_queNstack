package Kegiatan2;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue(3);

        // add some books to the queue
        queue.enqueue(new Book("Buku Matematika"));
        queue.enqueue(new Book("Buku Koding"));
        queue.enqueue(new Book("Buku Sejarah"));

        // dequeue some books from the queue
        Book firstBook = queue.dequeue();
        Book secondBook = queue.dequeue();

        // print the titles of the dequeued books
        System.out.println("List Buku Yang dipinjam\n");
        System.out.println("Buku pertama adalah "+ firstBook.getTitle());
        System.out.println("Buku kedua adalah "+ secondBook.getTitle());
        System.out.println("\nJumlah Buku yang tersedia adalah "+ queue.getSize());
        System.out.println("Buku yang terakhir dipinjam "+ queue.peek());

        if(queue.isEmpty()){
            System.out.println("Tidak ada buku yang tersedia");
        } else{
            System.out.println("Ada beberapa buku yang tersedia");
        }
    }

}
