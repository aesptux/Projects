//
//  ReverseString.h
//  projects_cpp
//
//  Created by Adrian Espinosa Moreno on 15/08/13.
//  Copyright (c) 2013 Adrian Espinosa Moreno. All rights reserved.
//

#ifndef projects_cpp_ReverseString_h
#define projects_cpp_ReverseString_h
#include <string>
#include <algorithm>

class ReverseString {
public: static std::string strrev(std::string s) {
    
    
    std::string rev;
    rev = std::string(s.rbegin(), s.rend());
    
    return rev;
}
};


#endif
