import java.util.Scanner; 
public class VideoLauncher {
    static class Video {
        String videoName;
        boolean checkout;
        int rating;

        Video(String name) {
            this.videoName = name;
            this.checkout = false;
            this.rating = 0;
        }

        String getName() {
            return videoName;
        }

        void doCheckout() {
            checkout = true;
        }

        void doReturn() {
            checkout = false;
        }

        void receiveRating(int rating) {
            this.rating = rating;
        }

        int getRating() {
            return rating;
        }

        boolean getCheckout() {
            return checkout;
        }
    }

    static class VideoStore {
        Video[] store = new Video[100];
        int count = 0;

        void addVideo(String name) {
            store[count++] = new Video(name);
            System.out.println("Video \"" + name + "\" added successfully.");
        }

        void doCheckout(String name) {
            for (int i = 0; i < count; i++) {
                if (store[i].getName().equals(name)) {
                    store[i].doCheckout();
                    System.out.println("Video \"" + name + "\" checked out successfully.");
                    return;
                }
            }
            System.out.println("Video \"" + name + "\" not found.");
        }

        void doReturn(String name) {
            for (int i = 0; i < count; i++) {
                if (store[i].getName().equals(name)) {
                    store[i].doReturn();
                    System.out.println("Video \"" + name + "\" returned successfully.");
                    return;
                }
            }
            System.out.println("Video \"" + name + "\" not found.");
        }

        void receiveRating(String name, int rating) {
            for (int i = 0; i < count; i++) {
                if (store[i].getName().equals(name)) {
                    store[i].receiveRating(rating);
                    System.out.println("Rating \"" + rating + "\" has been mapped to the Video \"" + name + "\".");
                    return;
                }
            }
            System.out.println("Video \"" + name + "\" not found.");
        }

        void listInventory() {
            System.out.println("--------------------------------------------------------");
            System.out.println("Video Name\t|\tCheckout Status\t|\tRating");
            for (int i = 0; i < count; i++) {
                System.out.println(store[i].getName() + "\t\t|\t" + store[i].getCheckout() + "\t\t|\t" + store[i].getRating());
            }
            System.out.println("--------------------------------------------------------");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VideoStore vs = new VideoStore();
        int choice;

        while (true) {
            System.out.println("MAIN MENU");
            System.out.println("=========");
            System.out.println("1.Add Videos:");
            System.out.println("2.Check Out Video:");
            System.out.println("3.Return Video:");
            System.out.println("4.Receive Rating:");
            System.out.println("5.List Inventory:");
            System.out.println("6.Exit:");
            System.out.print("Enter your choice(1..6): ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter the name of the video you want to add: ");
                    String addName = sc.nextLine();
                    vs.addVideo(addName);
                    break;
                case 2:
                    System.out.print("Enter the name of the video you want to check out: ");
                    String checkoutName = sc.nextLine();
                    vs.doCheckout(checkoutName);
                    break;
                case 3:
                    System.out.print("Enter the name of the video you want to Return: ");
                    String returnName = sc.nextLine();
                    vs.doReturn(returnName);
                    break;
                case 4:
                    System.out.print("Enter the name of the video you want to Rate: ");
                    String rateName = sc.nextLine();
                    System.out.print("Enter the rating for this video: ");
                    int rating = sc.nextInt();
                    sc.nextLine();
                    vs.receiveRating(rateName, rating);
                    break;
                case 5:
                    vs.listInventory();
                    break;
                case 6:
                    System.out.println("Exiting...!! Thanks for using the application.");
                    sc.close();
                    return;
                default:
                    System.out.println("Please enter a valid choice!");
            }
        }
    }
}