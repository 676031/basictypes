package Box;

public class App {
   // int vol = box1.heught*box1.length*box1.width;
    public static void main(String[] args){
        
        Mybox box1 = new Mybox();
        //Mybox box2 = new Mybox();
        Mybox box2 = new Mybox(100,500,200);
        box1.height = 10;
    }
}
    
//    box1.width = 100;
//    System.out.println("first box");
//    System.out.println(box1.getWidth());
//    System.out.println(box1.getLength());
//    System.out.println(box1.getHeight());
//            
//    System.out.println("box1 vol = " + vol);
//     
//    public Mybox(int width, int length, int height){
//        this.width = width;
//        this.length = length;
//        this.height = height;
//    }
//    public int getVolume(){
//        return width * length * height;
//    }