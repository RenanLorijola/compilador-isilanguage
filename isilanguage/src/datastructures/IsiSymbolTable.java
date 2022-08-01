package isilanguage.src.datastructures;

import java.util.HashMap;

public class IsiSymbolTable {
    private HashMap<String, IsiSymbol> symbols;

    public IsiSymbolTable() {
        symbols = new HashMap<String, IsiSymbol>();
    }

    public void add(IsiSymbol symbol) {
        symbols.put(symbol.getName(), symbol);
    }

    public IsiSymbol get(String name) {
        return symbols.get(name);
    }

    public boolean exists(String name) {
        return symbols.containsKey(name);
    }


}
