//
//  PigLatin.h
//  projects_cpp
//
//  Created by Adrian Espinosa Moreno on 16/08/13.
//  Copyright (c) 2013 Adrian Espinosa Moreno. All rights reserved.
//

#ifndef projects_cpp_PigLatin_h
#define projects_cpp_PigLatin_h

class PigLatin {
public: static std::string Pig(std::string s) {
    
    return s.substr(1, s.length()) + "-" + s.substr(0, 1) + "ay";
}

};
#endif
