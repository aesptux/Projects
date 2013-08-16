//
//  CountVowels.h
//  projects_cpp
//
//  Created by Adrian Espinosa Moreno on 16/08/13.
//  Copyright (c) 2013 Adrian Espinosa Moreno. All rights reserved.
//

#ifndef projects_cpp_CountVowels_h
#define projects_cpp_CountVowels_h


class VowelCounter {
    static bool is_vowel(char v) {
        return (v == 'e' || v == 'a' || v == 'i' || v == 'o' || v == 'u');
    }
    public: static long VCounter (std::string s) {
        
        long longVowels = std::count_if(s.begin(), s.end(), is_vowel);
        return longVowels;
    }
};


#endif
