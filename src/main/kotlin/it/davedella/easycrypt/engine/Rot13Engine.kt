package it.davedella.easycrypt.engine

import org.apache.commons.collections4.bidimap.DualHashBidiMap
import org.springframework.stereotype.Component

@Component
class Rot13Engine {

    var rot13: DualHashBidiMap<Char, Char> = populateRot13Map()

    private fun populateRot13Map(): DualHashBidiMap<Char, Char> {
        var rot13temp: DualHashBidiMap<Char, Char> = DualHashBidiMap<Char,Char>()
        rot13temp.put('a','n')
        rot13temp.put('b','o')
        rot13temp.put('c','p')
        rot13temp.put('d','q')
        rot13temp.put('e','r')
        rot13temp.put('f','s')
        rot13temp.put('g','t')
        rot13temp.put('h','u')
        rot13temp.put('i','v')
        rot13temp.put('j','w')
        rot13temp.put('k','x')
        rot13temp.put('l','y')
        rot13temp.put('m','z')
        rot13temp.put('A','N')
        rot13temp.put('B','O')
        rot13temp.put('C','P')
        rot13temp.put('D','Q')
        rot13temp.put('E','R')
        rot13temp.put('F','S')
        rot13temp.put('G','T')
        rot13temp.put('H','U')
        rot13temp.put('I','V')
        rot13temp.put('J','W')
        rot13temp.put('K','X')
        rot13temp.put('L','Y')
        rot13temp.put('M','Z')
        return rot13temp
    }

    fun crypt(string: String): String {
        var result: String = "";
        string.forEach { result += rot13.get(it) ?: rot13.getKey(it) ?: it }
        return result;
    }

}