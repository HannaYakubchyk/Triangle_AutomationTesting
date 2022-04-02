public class Triangle {

    int sideA;
    int sideB;
    int sideC;

    public Triangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    String isTriangle(Triangle triangle){
        if (sideA>=1 && sideB>=1 && sideC>=1)
        {
            if((sideA+sideB)>sideC&&(sideB+sideC)>sideA&&(sideC+sideA)>sideB){
                if(sideA==sideB&&sideB==sideC&&sideA==sideC){
                     return "Это равносторонний треугольник";
            }
                else if(sideA==sideB||sideB==sideC||sideA==sideC){
                    return "Это равнобедренный треугольник";
                }
                else return "Это разносторонний треугольник";}
            else return "Это не треугольник";
        }
        else return "Любое из вводимых значений не может быть равно 0 или быть меньше 0";
}
}
