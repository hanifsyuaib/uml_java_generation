# UML to Java Code Generation with Acceleo

This project demonstrates model-to-text transformation using Acceleo to generate Java code from UML Class models within Eclipse. 

Source Code: https://wiki.eclipse.org/Acceleo/Getting_Started 

## Table of Contents
- [Learning Acceleo](#learning-acceleo)
- [Process](#process)
- [Challenges](#challenges)


## Learning Acceleo

### 1. Acceleo/User Guide

Link: https://wiki.eclipse.org/Acceleo/User_Guide

Materi yang dipelajari:

* Acceleo language
* Acceleo tooling
* Acceleo launching
* Acceleo deploying
* Acceleo working with an existing generator
* Acceleo integrating in an existing workflow

### 2. Acceleo/Maven

Link: https://wiki.eclipse.org/Acceleo/Maven

Materi yang dipelajari:

* Compilation
* Execution

### 3. Acceleo/Interpreter

Link: https://wiki.eclipse.org/Acceleo/Interpreter

Materi yang dipelajari:

* Language selection
* Expression
* Evaluation result
* Sub-Expressions
* Variables
* Feedback
* Actions
* Additional interpreters

### 4. Acceleo/Runtime

Link: https://wiki.eclipse.org/Acceleo/Runtime

Materi yang dipelajari:

* Compiler
* Generation engine
* Stand alone

### 5. Acceleo/Views Perspective

Link: https://wiki.eclipse.org/Acceleo/Views_Perspective

Materi yang dipelajari:

* Views and Perspective
* Overrides View
* Result View
* Generation Pattern

### 6. Acceleo/Module Editor

Link: https://wiki.eclipse.org/Acceleo/Acceleo_Editor

Materi yang dipelajari:

* Syntax highlighting
* Smart completion
* Navigation to definitions and references
* Error detection
* Quick fixes
* Warning and information support
* Dynamic outline
* Quick outline
* Code folding
* Code templates
* Documentation hover
* Visible whitespace characters
* Search of occurrences
* Refactoring

### 7. MOF Model to Text Transformation Language

Link: https://www.omg.org/spec/MOFM2T/1.0/PDF

Materi yang dipelajari:

* Overview of mof2text
* Template language specification
* Example

### 8. Overview in the eclipse model-driven architecture tools

Link:
https://www.itm-conferences.org/articles/itmconf/pdf/2022/06/itmconf_iceas2022_02001.pdf

Materi yang dipelajari:

* Model-driven architecture
* Model transformations
* Model transformations tools

### 9. Acceleo Best Practices

Link: https://www.obeosoft.com/en/acceleo-best-practices

Materi yang dipelajari:

* Naming conventions
* Architecture of Acceleo project
* Writing a good module
* Usage of Java services
* Preventing problems with traceability information
* Testing Acceleo generator
* Managing user code

### 10. Code generation from visual models using Eclipse Sirius and Acceleo

Link: https://blog.anj.ai/2020/12/acceleo.html

Materi yang dipelajari:

* Generate code from custom modelling language

### 11. Acceleo 4 ever by Eclipse Foundation

Link: https://youtu.be/XWXKzL8bi1g

Materi yang dipelajari:

* Template-based approach of Acceleo
* EMF model-to-text generation
* Acceleo 4 demo
* Acceleo Query Language

### 12. Acceleo Model To Text Transformation by Jose Alfonso Aguilar

Link: https://youtu.be/i68L4R5XGIw

Materi yang dipelajari:

* Example Acceleo model to text using Eclipse Acceleo plugin

### 13. Code generation using Acceleo by Marco Di Natale

Link: https://youtu.be/42jkrOWA9RE

Materi yang dipelajari:

* Example Acceleo project

### 14. Acceleo/Getting Started

Link: https://wiki.eclipse.org/Acceleo/Getting_Started

Materi yang dipelajari:

* Create UML Class to Java Generation Acceleo Project
* Generating Java Beans
* User code blocks
* Java services wrappers
* Create main module
* Create UI launcher

## Process

### 1. UML

Pembuatan UML Class menggunakan Papyrus Software Designer. UML Class yang dibuat berupa Mahasiswa.uml, terdiri dari tiga class, yaitu Mahasiswa, MataKuliah, dan ProgramStudi. Selain itu, dibentuk asosiasi antara Mahasiswa dan MataKuliah dengan konteks mahasiswa dapat mengambil mata kuliah dan dibentuk asosiasi antara Mahasiswa dan ProgramStudi dengan konteks setiap mahasiswa terdaftar di suatu program studi. Proses pembuatan UML berjalan lancar, namun saat pembuatan asosiasi yang merupakan bagian terakhir muncul kendala dimana tidak bisa mengakses Properties dan bermunculan error message (akan dibahas lebih lanjut dibawah). Lalu, ditemukan solusinya yaitu dengan dilanjutkan pengerjaan di Generic Code Editor.

### 2. Acceleo Generation Module

Acceleo generation module dinamakan generate.mtl. Berdasarkan generate.mtl, setiap variabel dari Class yang ada di UML akan diinisiasi, dibuatkan get method, dan dibuatkan set method. Kemudian, setiap method dari Class pada UML akan dibuatkan method kosong dengan comment TODO didalamnya untuk menandakan bahwa method tersebut perlu di implementasi. 

### 3. Generated Java File

Runner yang digunakan adalah Java Application. Oleh karena itu, terdapat penyesuaian terlebih dahulu pada MANIFEST.MF dan Generate.java sebelum run Acceleo application.

## Challenges

### 1. Error muncul pada proses pembuatan bagian akhir pada UML

Setiap menekan tombol apapun di eclipse maka error yang sama akan muncul pada bagian org. clipse.e4.ui.workbench. Kemudian, dilakukan beberapa hal dalam usaha menangani error:

- Melakukan cleaning untuk flush plugin caches dengan melakukan langkah berikut:
    1. Close eclipse
    2. Buka properties dari eclipse
    3. Pada bagian Target, tambahkan “ -clean” sehingga Target menjadi “/path/ -clean”
    4. Open eclipse

- Reset Perspective dengan melakukan langkah berikut:
    1. Pada eclipse, memilih Window > Perspective > Reset Perspective
    2. Konfirmasi reset ke default settings
    3. Membuka kembali Properties dengan Window > Show View > Other > General > Properties

Walaupun, sudah melakukan langkah yang diatas beberapa kali masih saja setiap menekan tombol apapun di eclipse maka error yang sama akan muncul. Karena error dengan pop up message yang tetap muncul tersebut tidak menghentikan pengerjaan bagian lainnya, maka error pop up message akhirnya diabaikan selagi melanjutkan pengerjaan lainnya.

Setelah dilakukan restart eclipse dan clean project beberapa kali dalam proses pengerjaan bagian lainnya, akhirnya error tersebut berhenti sendiri ditandai dengan tidak ada error pop up message dan tidak ada error tersebut di Error Log.

### 2. Error dalam generate Java file

Error muncul pada Activator.java, MANIFEST.MF, dan Generate.java. Misalnya, pada baris 11 pada Generate.java terdapat error dimana package tidak terdeteksi.

Oleh karena itu, melakukan pengecekan dan perbaikan pada settings dan configurations dengan asumsi error muncul dari situ. Setelah mencoba memahami mengapa quick fixes memberi saran berupa fix package menjadi “org.eclipse.acceleo.module.uml”, maka ditemukan ternyata kesalahannya terletak pada penamaan project yaitu “uml-java-generation” dimana penggunaan hypens (-) merupakan java identifier yang tidak valid. Dengan demikian, refactor rename project menjadi “uml_java_generation” membuat error tidak muncul kembali dan generate Java file berhasil dijalankan.
