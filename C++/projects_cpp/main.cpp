//
//  main.cpp
//  projects_cpp
//
//  Created by Adrian Espinosa Moreno on 13/08/13.
//  Copyright (c) 2013 Adrian Espinosa Moreno. All rights reserved.
//

#include <iostream>
#include "Numbers/factorial.h"
#include "Text/ReverseString.h"
#include "Text/PigLatin.h"
#include "Text/CountVowels.h"


int main(int argc, const char * argv[])
{
    /* FACTORIAL */
    std::cout << Factorial::factorial_loop(20) << std::endl;
    
    /* REVERSE STRING */
    std::cout << ReverseString::strrev("Hi my friend") << std::endl;
    
    /* PIG LATIN */
    std::cout << PigLatin::Pig("banana") << std::endl;
    
    /* COUNT VOWELS */
    std::cout << VowelCounter::VCounter("Magical software") << std::endl;
    return 0;
}

