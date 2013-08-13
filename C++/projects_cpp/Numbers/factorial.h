//
//  factorial.h
//  projects_cpp
//
//  Created by Adrian Espinosa Moreno on 13/08/13.
//  Copyright (c) 2013 Adrian Espinosa Moreno. All rights reserved.
//

#ifndef projects_cpp_factorial_h
#define projects_cpp_factorial_h

class Factorial {
    
    public: static long factorial_loop(int num) {
        long f = 1;
        while (num > 0) {
            f *= num;
            num--;
        }
        
        return f;
    }
};


#endif
