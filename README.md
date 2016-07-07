# Java Scrabble Score

#### By _Ming Wen_

## Description

Write a method that takes a word and returns the Scrabble score for that word. Here are the values of letters in Scrabble:

    A, E, I, O, U, L, N, R, S, T       1
    D, G                               2
    B, C, M, P                         3
    F, H, V, W, Y                      4
    K                                  5
    J, X                               8
    Q, Z                               10

After writing a functional method with thorough, passing tests, create a website that allows users to input words and receive their scrabble scores.

Here is a spec to begin with:

    @Test
    public void calculateScore_returnsScoreForSingleLetter_1() {
      Scrabble testScrabble = new Scrabble();
      Integer expected = 1;
      assertEquals(expected, testScrabble.calculateScore("a"));
    }

## Setup and Installation Requirements

  Clone the repo.  
  Run a instance of the gradle web server with 'gradle run'.  
  Navigate to localhost:4567
  
  Additionally, tests can be run with 'gradle test'.

### License

Available for use under the MIT license.
Copyright (c) 2016 **_Ming Wen_**

  Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

  The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
