public double potencia(double a, int n) {
    double res = 1.0;
    for (int i = 0; i < n; i++)
    	res = res * a;
    return res;
}
