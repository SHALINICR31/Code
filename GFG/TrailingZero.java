int count = 0;
        
        // Keep dividing n by powers of 5 (5, 25, 125...) and add to count
        while (n >= 5) {
            n = n / 5;
            count += n;
        }
        
        return count;
