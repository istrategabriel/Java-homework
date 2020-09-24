package Homework6;

public class Wall {

    private  double width;
    private double height;



        public void setWidth ( double width){
            if (width < 0) {
                this.width = 0;
                return;
            }
                this.width = width;

        }
         public double getWidth () {
             return width;
        }


        public void setHeight ( double height){
            if (height < 0) {
                this.height = 0;
                return;
            }
                this.height = height;

        }
    public double getHeight () {
        return height;
    }

        public double getArea () {
            return width * height;
        }

    public Wall() {
    }


    public Wall (double width, double height){
        if (height < 0|| width<0) {
            this.height = 0;
            this.width =0;
            return;
        }

            this.height = height;
            this.width = width;

    }

}






