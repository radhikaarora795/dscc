class LamportClock{
    public static void main(String[] args) {
        int p1=0;
        int p2=0;
        int p3=0;

        p1++;
        System.out.println("P1 local event: "+p1);

        p1++;
        int message=p1;
        System.out.println("p1 sends message: "+message);

        p2=Math.max(p2,message)+1;
        System.out.println("p2 recieves message: "+p2);

        p2++;
        System.out.println("P2 local event: "+p1);

        p2++;
        message=p2;
        System.out.println("p2 sends message: "+message);

        p3=Math.max(p3,message)+1;
        System.out.println("p3 recieves message: "+p3);
    }
}