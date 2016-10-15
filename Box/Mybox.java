package Box;


public class Mybox {
    
    static int count = 0;
    int width;
    int length;
    int height;
    
    
    
    public Mybox() {
        width = 10;
        length = 10;
        height = 10;
    }
    
//      public Mybox(int width, int length, int height){
//        width = width;
//        length = length;
//        height = height;
//      }
      
      public Mybox(int width, int length, int height){
        this.width = width;
        this.length = length;
        this.height = height;
      }
    
//    public Mybox(){
//        throw new UnsupportedOperationException("Not supported yet."); 
//    }
    
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); //To change body of generated methods, choose Tools | Templates.
    }
    
    public int getWidth(){
        return width;
    }
    public void setWidth(int width){
        if(width<=0){
            throw new IllegalArgumentException("Banan BRO");
        }
        this.width = width;
    }
    public int getLength(){
        return length;
    }
        public void setLength(int length){
        if(length<=0){
            throw new IllegalArgumentException();
        }
        this.length = length;
    }
        public int getHeight(){
        return height;
    }
        public void setHeight(int height){
        if(height<=0){
            throw new IllegalArgumentException();
        }
        this.height = height;
    }
      
    public int getVolume(){
        return width * length * height;
    }
    
    public void resize(int factor){
        if(factor<=0){
            throw new IllegalArgumentException();
        }
        width*=2;
        height*=2;
        length*=2;
    }
//    public boolean resize1(Mybox x,int factor){
//        if(factor<=0){
//            false;
//        }
//        x.width*=2;
//        x.height*=2;
//        x.length*=2;
//        return true;
//    }
}
