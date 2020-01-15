# POC for CompletableFuture

The java file creates a `CompletableFuture` without calling `.get()` 
that will print out `Alternate Thread.` during it's execution.
It then calls `Thread.sleep(1000)` on the main thread before printing `After sleep.`
It then calls `.get()` on the `CompletableFuture` and prints the result.

Output of run:
```
Alternate Thread.
After sleep.
Future Complete
```