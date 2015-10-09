[SBT](https://github.com/paulp/sbt-extras) plugin to build LaTeX projects with SBT! Inspired by [latex-cv](https://github.com/stuhood/latex-cv).

Features:
  * Manages the ugly intermediate TeX files so you don't have to look at them.
  * Can automatically rebuild your project whenever a file changes:
    * Start `sbt` and run `~latex`.

To use:
  * Make sure `pdflatex` and `bibtex` are installed, as well as any LaTeX libraries you may want.
    * In Ubuntu, you can install everything with `sudo apt-get install texlive-full`.
  * for scala 2.9 use emchristiansen's version
  * Add the command `addSbtPlugin("zeitos" % "sbt-latex" % "0.1.2")` to `project/plugins.sbt`.
  * Expected file locations:
    * Place your main `.tex` source in `src/main/latex/`.
    * Place resources, like `.bib` files and figures, in `src/main/resources/`.
    * Place external dependencies, like `.sty` files, in `lib/`.

You can also use the [giter8 template](https://github.com/emchristiansen/sbt-latex.g8) to auto-generate a LaTeX project.

License: Public domain 


