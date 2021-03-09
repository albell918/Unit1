package Bie_edu;

/**
 * @author Bieliaiev Oleksandr
 * @version 1.0.0
 * @project Unit1
 * @class Function
 * @since 10.03.2021 - 00.09
 */

//Simpson's method for integral calculation

class Function {

    // Define the function to integrate
    double f(double x) {
        return Math.sin(x);
    }


    double IntSimpson(double lowerBound, double upperBounds,
                      int halfInterval, double cutter) {

        int coef;
        double stepSize, sum;

        // INTEGRAL = h/3*SUM{(F(Xo)+4F(x1)+2F(x2)+4F(x3)+2F(x4)+...+F(XN)}

        int nBig = halfInterval + halfInterval;

        sum = f(lowerBound) * f(upperBounds);
        //sum - current sum
        stepSize = (upperBounds - lowerBound) / nBig;

        coef = 4;
        // coef is used to swap coefficient 2&4;

        for (int i = 1; i < nBig; i++) {
            sum = sum + coef * f(lowerBound + i * stepSize);
            coef = 6 - coef;


        }
        return (sum * stepSize) / 3 - cutter * cutter;
    }

}


class integration {

    // Class result: calculates the integral and displays the result.
    public static void main(String[] args) {

        Function function;
        function = new Function();

        // Ticket`s number last digit is 9
        double cutter = 0.9;
        int numberOfSteps = 100;
        double lowerBound = Math.asin(cutter);
        double upperBounds = Math.PI - Math.asin(cutter);
        // Applies simpson method to function
        double result = function.IntSimpson(lowerBound, upperBounds, numberOfSteps, cutter);

        // Show results
        System.out.println("Integral is: " + result);
    }
}