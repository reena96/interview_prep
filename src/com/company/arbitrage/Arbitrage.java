package com.company.arbitrage;

/******************************************************************************
 *  Compilation:  javac Arbitrage.java
 *  Execution:    java Arbitrage < input.txt
 *  Dependencies: EdgeWeightedDigraph.java DirectedEdge.java
 *                BellmanFordSP.java
 *  Data file:    https://algs4.cs.princeton.edu/44sp/rates.txt
 *
 *  Arbitrage detection.
 *
 *  % more rates.txt
 *  5
 *  USD 1      0.741  0.657  1.061  1.005
 *  EUR 1.349  1      0.888  1.433  1.366
 *  GBP 1.521  1.126  1      1.614  1.538
 *  CHF 0.942  0.698  0.619  1      0.953
 *  CAD 0.995  0.732  0.650  1.049  1
 *
 *  % java Arbitrage < rates.txt
 *  1000.00000 USD =  741.00000 EUR
 *   741.00000 EUR = 1012.20600 CAD
 *  1012.20600 CAD = 1007.14497 USD
 *
 ******************************************************************************/

/**
 *  The {@code Arbitrage} class provides a client that finds an arbitrage
 *  opportunity in a currency exchange table by constructing a
 *  complete-digraph representation of the exchange table and then finding
 *  a negative cycle in the digraph.
 *  <p>
 *  This implementation uses the Bellman-Ford algorithm to find a
 *  negative cycle in the complete digraph.
 *  The running time is proportional to <em>V</em><sup>3</sup> in the
 *  worst case, where <em>V</em> is the number of currencies.
 *  <p>
 *  For additional documentation,
 *  see <a href="https://algs4.cs.princeton.edu/44sp">Section 4.4</a> of
 *  <i>Algorithms, 4th Edition</i> by Robert Sedgewick and Kevin Wayne.
 *
 *  @author Robert Sedgewick
 *  @author Kevin Wayne
 */
public class Arbitrage {

    // this class cannot be instantiated
    private Arbitrage() { }

    /**
     *  Reads the currency exchange table from standard input and
     *  prints an arbitrage opportunity to standard output (if one exists).
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) {

        // V currencies
        int V = 6;
        String[] name = new String[V];
        name[0] = "a1";
        name[1] = "a2";
        name[3] = "a3";
        name[4] = "a4";
        name[5] = "a6";
        double rate = 0.1;
        System.out.println(-Math.log(0.1));
        // create complete network
        EdgeWeightedDigraph G = new EdgeWeightedDigraph(V);
        for (int v = 0; v < V; v++) {

            for (int w = 0; w < V; w++) {
                if(v==w || v== w+1){
                    rate = 1;
                }
                DirectedEdge e = new DirectedEdge(v, w, -Math.log(rate));
                System.out.println(" From "+e.from()+" To  "+e.to()+" Weight "+e.weight());
                G.addEdge(e);
                rate = rate + 0.1;
            }
        }

        // find negative cycle
        BellmanFordSP spt = new BellmanFordSP(G, 0);
        if (spt.hasNegativeCycle()) {
            double shares = 1000.0;
            for (DirectedEdge e : spt.negativeCycle()) {
                System.out.println("-----------");
                System.out.println(" From "+e.from()+" To  "+e.to()+" Weight "+e.weight());
                StdOut.println("Arbitrage opportunity detected");
                 StdOut.printf("%10.5f %s ", shares, name[e.from()]);
                shares *= Math.exp(-e.weight());
                StdOut.printf("= %10.5f %s\n", shares, name[e.to()]);

            }
        }
        else {
            StdOut.println("No arbitrage opportunity");
        }
    }

}