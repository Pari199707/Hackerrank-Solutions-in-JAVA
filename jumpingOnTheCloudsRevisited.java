static int jumpingOnClouds(int[] c, int k) {
        int energy = 100;
        int currentIndex = 0;
    do {
        energy -= 1;
        currentIndex = (currentIndex + k) % c.length;
        if (c[currentIndex] == 1) energy -= 2;
    } while (currentIndex != 0);
    return energy;
}
