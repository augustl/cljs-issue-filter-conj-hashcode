# cljs-bug

This repo contains runnable examples for running an example that demonstrates an issue with ClojureScript.

# Steps to reproduce

## 1) Run the Clojure example

Run the Clojure example with:

    lein run

The code shows the correct expected output when running under Clojure

## 2) Run the ClojureScript example

Run the ClojureScript example by:

1) Running `lein cljsbuild once`
2) Open the file "web.html" in the root of this git repo in a browser
3) Open the web inspector and take a look at the output of the ClojureScript code there

# Output

Clojure:

    $> java -version
    java version "1.8.0_45"
    Java(TM) SE Runtime Environment (build 1.8.0_45-b14)
    Java HotSpot(TM) 64-Bit Server VM (build 25.45-b02, mixed mode)
    $> lein run
    
    156247261 2
    829981563 1
    -2017569654 0
    -1154116787 1
    -733651870 2
    1036804101 3

ClojureScript:

    $> lein cljsbuild once
    Compiling ClojureScript...
    Compiling "target/classes/public/app.js" from ["src"]...
    Successfully compiled "target/classes/public/app.js" in 0.536 seconds.
    $> firefox web.html

    (Output from Firefox console follows)
    1185709346 2
    -1917711765 1
    -2017569654 0
    -1025653387 1
    -1025653387 2
    -1025653387 3
