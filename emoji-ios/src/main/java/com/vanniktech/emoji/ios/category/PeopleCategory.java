package com.vanniktech.emoji.ios.category;

import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import com.vanniktech.emoji.emoji.Emoji;
import com.vanniktech.emoji.emoji.EmojiCategory;
import com.vanniktech.emoji.ios.R;

@SuppressWarnings("PMD.MethodReturnsInternalArray") public final class PeopleCategory implements EmojiCategory {
  private static final Emoji[] DATA = new Emoji[] {
    new Emoji(0x1f600, R.drawable.emoji_ios_1f600),
    new Emoji(0x1f603, R.drawable.emoji_ios_1f603),
    new Emoji(0x1f604, R.drawable.emoji_ios_1f604),
    new Emoji(0x1f601, R.drawable.emoji_ios_1f601),
    new Emoji(0x1f606, R.drawable.emoji_ios_1f606),
    new Emoji(0x1f605, R.drawable.emoji_ios_1f605),
    new Emoji(0x1f602, R.drawable.emoji_ios_1f602),
    new Emoji(0x1f923, R.drawable.emoji_ios_1f923),
    new Emoji(0x263a, R.drawable.emoji_ios_263a),
    new Emoji(0x1f60a, R.drawable.emoji_ios_1f60a),
    new Emoji(0x1f607, R.drawable.emoji_ios_1f607),
    new Emoji(0x1f642, R.drawable.emoji_ios_1f642),
    new Emoji(0x1f643, R.drawable.emoji_ios_1f643),
    new Emoji(0x1f609, R.drawable.emoji_ios_1f609),
    new Emoji(0x1f60c, R.drawable.emoji_ios_1f60c),
    new Emoji(0x1f60d, R.drawable.emoji_ios_1f60d),
    new Emoji(0x1f618, R.drawable.emoji_ios_1f618),
    new Emoji(0x1f617, R.drawable.emoji_ios_1f617),
    new Emoji(0x1f619, R.drawable.emoji_ios_1f619),
    new Emoji(0x1f61a, R.drawable.emoji_ios_1f61a),
    new Emoji(0x1f60b, R.drawable.emoji_ios_1f60b),
    new Emoji(0x1f61c, R.drawable.emoji_ios_1f61c),
    new Emoji(0x1f61d, R.drawable.emoji_ios_1f61d),
    new Emoji(0x1f61b, R.drawable.emoji_ios_1f61b),
    new Emoji(0x1f911, R.drawable.emoji_ios_1f911),
    new Emoji(0x1f917, R.drawable.emoji_ios_1f917),
    new Emoji(0x1f913, R.drawable.emoji_ios_1f913),
    new Emoji(0x1f60e, R.drawable.emoji_ios_1f60e),
    new Emoji(0x1f921, R.drawable.emoji_ios_1f921),
    new Emoji(0x1f920, R.drawable.emoji_ios_1f920),
    new Emoji(0x1f60f, R.drawable.emoji_ios_1f60f),
    new Emoji(0x1f612, R.drawable.emoji_ios_1f612),
    new Emoji(0x1f61e, R.drawable.emoji_ios_1f61e),
    new Emoji(0x1f614, R.drawable.emoji_ios_1f614),
    new Emoji(0x1f61f, R.drawable.emoji_ios_1f61f),
    new Emoji(0x1f615, R.drawable.emoji_ios_1f615),
    new Emoji(0x1f641, R.drawable.emoji_ios_1f641),
    new Emoji(0x2639, R.drawable.emoji_ios_2639),
    new Emoji(0x1f623, R.drawable.emoji_ios_1f623),
    new Emoji(0x1f616, R.drawable.emoji_ios_1f616),
    new Emoji(0x1f62b, R.drawable.emoji_ios_1f62b),
    new Emoji(0x1f629, R.drawable.emoji_ios_1f629),
    new Emoji(0x1f624, R.drawable.emoji_ios_1f624),
    new Emoji(0x1f620, R.drawable.emoji_ios_1f620),
    new Emoji(0x1f621, R.drawable.emoji_ios_1f621),
    new Emoji(0x1f636, R.drawable.emoji_ios_1f636),
    new Emoji(0x1f610, R.drawable.emoji_ios_1f610),
    new Emoji(0x1f611, R.drawable.emoji_ios_1f611),
    new Emoji(0x1f62f, R.drawable.emoji_ios_1f62f),
    new Emoji(0x1f626, R.drawable.emoji_ios_1f626),
    new Emoji(0x1f627, R.drawable.emoji_ios_1f627),
    new Emoji(0x1f62e, R.drawable.emoji_ios_1f62e),
    new Emoji(0x1f632, R.drawable.emoji_ios_1f632),
    new Emoji(0x1f635, R.drawable.emoji_ios_1f635),
    new Emoji(0x1f633, R.drawable.emoji_ios_1f633),
    new Emoji(0x1f631, R.drawable.emoji_ios_1f631),
    new Emoji(0x1f628, R.drawable.emoji_ios_1f628),
    new Emoji(0x1f630, R.drawable.emoji_ios_1f630),
    new Emoji(0x1f622, R.drawable.emoji_ios_1f622),
    new Emoji(0x1f625, R.drawable.emoji_ios_1f625),
    new Emoji(0x1f924, R.drawable.emoji_ios_1f924),
    new Emoji(0x1f62d, R.drawable.emoji_ios_1f62d),
    new Emoji(0x1f613, R.drawable.emoji_ios_1f613),
    new Emoji(0x1f62a, R.drawable.emoji_ios_1f62a),
    new Emoji(0x1f634, R.drawable.emoji_ios_1f634),
    new Emoji(0x1f644, R.drawable.emoji_ios_1f644),
    new Emoji(0x1f914, R.drawable.emoji_ios_1f914),
    new Emoji(0x1f925, R.drawable.emoji_ios_1f925),
    new Emoji(0x1f62c, R.drawable.emoji_ios_1f62c),
    new Emoji(0x1f910, R.drawable.emoji_ios_1f910),
    new Emoji(0x1f922, R.drawable.emoji_ios_1f922),
    new Emoji(0x1f927, R.drawable.emoji_ios_1f927),
    new Emoji(0x1f637, R.drawable.emoji_ios_1f637),
    new Emoji(0x1f912, R.drawable.emoji_ios_1f912),
    new Emoji(0x1f915, R.drawable.emoji_ios_1f915),
    new Emoji(0x1f608, R.drawable.emoji_ios_1f608),
    new Emoji(0x1f47f, R.drawable.emoji_ios_1f47f),
    //new Emoji(0x1f479, R.drawable.emoji_ios_1f479),
    //new Emoji(0x1f47a, R.drawable.emoji_ios_1f47a),
    new Emoji(0x1f4a9, R.drawable.emoji_ios_1f4a9),
    new Emoji(0x1f47b, R.drawable.emoji_ios_1f47b),
    //new Emoji(0x1f480, R.drawable.emoji_ios_1f480),
    new Emoji(0x2620, R.drawable.emoji_ios_2620),
    new Emoji(0x1f47d, R.drawable.emoji_ios_1f47d),
    //new Emoji(0x1f47e, R.drawable.emoji_ios_1f47e),
    new Emoji(0x1f916, R.drawable.emoji_ios_1f916),
    //new Emoji(0x1f383, R.drawable.emoji_ios_1f383),
    new Emoji(0x1f63a, R.drawable.emoji_ios_1f63a),
    new Emoji(0x1f638, R.drawable.emoji_ios_1f638),
    new Emoji(0x1f639, R.drawable.emoji_ios_1f639),
    new Emoji(0x1f63b, R.drawable.emoji_ios_1f63b),
    new Emoji(0x1f63c, R.drawable.emoji_ios_1f63c),
    new Emoji(0x1f63d, R.drawable.emoji_ios_1f63d),
    new Emoji(0x1f640, R.drawable.emoji_ios_1f640),
    new Emoji(0x1f63f, R.drawable.emoji_ios_1f63f),
    new Emoji(0x1f63e, R.drawable.emoji_ios_1f63e),
    new Emoji(0x1f450, R.drawable.emoji_ios_1f450
      //new Emoji(new int[] { 0x1f450, 0x1f3fb }, R.drawable.emoji_ios_1f450_1f3fb),
      //new Emoji(new int[] { 0x1f450, 0x1f3fc }, R.drawable.emoji_ios_1f450_1f3fc),
      //new Emoji(new int[] { 0x1f450, 0x1f3fd }, R.drawable.emoji_ios_1f450_1f3fd),
      //new Emoji(new int[] { 0x1f450, 0x1f3fe }, R.drawable.emoji_ios_1f450_1f3fe),
      //new Emoji(new int[] { 0x1f450, 0x1f3ff }, R.drawable.emoji_ios_1f450_1f3ff)
    ),
    new Emoji(0x1f64c, R.drawable.emoji_ios_1f64c
      //new Emoji(new int[] { 0x1f64c, 0x1f3fb }, R.drawable.emoji_ios_1f64c_1f3fb),
      //new Emoji(new int[] { 0x1f64c, 0x1f3fc }, R.drawable.emoji_ios_1f64c_1f3fc),
      //new Emoji(new int[] { 0x1f64c, 0x1f3fd }, R.drawable.emoji_ios_1f64c_1f3fd),
      //new Emoji(new int[] { 0x1f64c, 0x1f3fe }, R.drawable.emoji_ios_1f64c_1f3fe),
      //new Emoji(new int[] { 0x1f64c, 0x1f3ff }, R.drawable.emoji_ios_1f64c_1f3ff)
    ),
    new Emoji(0x1f44f, R.drawable.emoji_ios_1f44f
      //new Emoji(new int[] { 0x1f44f, 0x1f3fb }, R.drawable.emoji_ios_1f44f_1f3fb),
      //new Emoji(new int[] { 0x1f44f, 0x1f3fc }, R.drawable.emoji_ios_1f44f_1f3fc),
      //new Emoji(new int[] { 0x1f44f, 0x1f3fd }, R.drawable.emoji_ios_1f44f_1f3fd),
      //new Emoji(new int[] { 0x1f44f, 0x1f3fe }, R.drawable.emoji_ios_1f44f_1f3fe),
      //new Emoji(new int[] { 0x1f44f, 0x1f3ff }, R.drawable.emoji_ios_1f44f_1f3ff)
    ),
    new Emoji(0x1f64f, R.drawable.emoji_ios_1f64f
      //new Emoji(new int[] { 0x1f64f, 0x1f3fb }, R.drawable.emoji_ios_1f64f_1f3fb),
      //new Emoji(new int[] { 0x1f64f, 0x1f3fc }, R.drawable.emoji_ios_1f64f_1f3fc),
      //new Emoji(new int[] { 0x1f64f, 0x1f3fd }, R.drawable.emoji_ios_1f64f_1f3fd),
      //new Emoji(new int[] { 0x1f64f, 0x1f3fe }, R.drawable.emoji_ios_1f64f_1f3fe),
      //new Emoji(new int[] { 0x1f64f, 0x1f3ff }, R.drawable.emoji_ios_1f64f_1f3ff)
    ),
    new Emoji(0x1f91d, R.drawable.emoji_ios_1f91d),
    new Emoji(0x1f44d, R.drawable.emoji_ios_1f44d
      //new Emoji(new int[] { 0x1f44d, 0x1f3fb }, R.drawable.emoji_ios_1f44d_1f3fb),
      //new Emoji(new int[] { 0x1f44d, 0x1f3fc }, R.drawable.emoji_ios_1f44d_1f3fc),
      //new Emoji(new int[] { 0x1f44d, 0x1f3fd }, R.drawable.emoji_ios_1f44d_1f3fd),
      //new Emoji(new int[] { 0x1f44d, 0x1f3fe }, R.drawable.emoji_ios_1f44d_1f3fe),
      //new Emoji(new int[] { 0x1f44d, 0x1f3ff }, R.drawable.emoji_ios_1f44d_1f3ff)
    ),
    new Emoji(0x1f44e, R.drawable.emoji_ios_1f44e
      //new Emoji(new int[] { 0x1f44e, 0x1f3fb }, R.drawable.emoji_ios_1f44e_1f3fb),
      //new Emoji(new int[] { 0x1f44e, 0x1f3fc }, R.drawable.emoji_ios_1f44e_1f3fc),
      //new Emoji(new int[] { 0x1f44e, 0x1f3fd }, R.drawable.emoji_ios_1f44e_1f3fd),
      //new Emoji(new int[] { 0x1f44e, 0x1f3fe }, R.drawable.emoji_ios_1f44e_1f3fe),
      //new Emoji(new int[] { 0x1f44e, 0x1f3ff }, R.drawable.emoji_ios_1f44e_1f3ff)
    ),
    new Emoji(0x1f44a, R.drawable.emoji_ios_1f44a
      //new Emoji(new int[] { 0x1f44a, 0x1f3fb }, R.drawable.emoji_ios_1f44a_1f3fb),
      //new Emoji(new int[] { 0x1f44a, 0x1f3fc }, R.drawable.emoji_ios_1f44a_1f3fc),
      //new Emoji(new int[] { 0x1f44a, 0x1f3fd }, R.drawable.emoji_ios_1f44a_1f3fd),
      //new Emoji(new int[] { 0x1f44a, 0x1f3fe }, R.drawable.emoji_ios_1f44a_1f3fe),
      //new Emoji(new int[] { 0x1f44a, 0x1f3ff }, R.drawable.emoji_ios_1f44a_1f3ff)
    ),
    new Emoji(0x270a, R.drawable.emoji_ios_270a
      //new Emoji(new int[] { 0x270a, 0x1f3fb }, R.drawable.emoji_ios_270a_1f3fb),
      //new Emoji(new int[] { 0x270a, 0x1f3fc }, R.drawable.emoji_ios_270a_1f3fc),
      //new Emoji(new int[] { 0x270a, 0x1f3fd }, R.drawable.emoji_ios_270a_1f3fd),
      //new Emoji(new int[] { 0x270a, 0x1f3fe }, R.drawable.emoji_ios_270a_1f3fe),
      //new Emoji(new int[] { 0x270a, 0x1f3ff }, R.drawable.emoji_ios_270a_1f3ff)
    ),
    new Emoji(0x1f91b, R.drawable.emoji_ios_1f91b
      //new Emoji(new int[] { 0x1f91b, 0x1f3fb }, R.drawable.emoji_ios_1f91b_1f3fb),
      //new Emoji(new int[] { 0x1f91b, 0x1f3fc }, R.drawable.emoji_ios_1f91b_1f3fc),
      //new Emoji(new int[] { 0x1f91b, 0x1f3fd }, R.drawable.emoji_ios_1f91b_1f3fd),
      //new Emoji(new int[] { 0x1f91b, 0x1f3fe }, R.drawable.emoji_ios_1f91b_1f3fe),
      //new Emoji(new int[] { 0x1f91b, 0x1f3ff }, R.drawable.emoji_ios_1f91b_1f3ff)
    ),
    new Emoji(0x1f91c, R.drawable.emoji_ios_1f91c
      //new Emoji(new int[] { 0x1f91c, 0x1f3fb }, R.drawable.emoji_ios_1f91c_1f3fb),
      //new Emoji(new int[] { 0x1f91c, 0x1f3fc }, R.drawable.emoji_ios_1f91c_1f3fc),
      //new Emoji(new int[] { 0x1f91c, 0x1f3fd }, R.drawable.emoji_ios_1f91c_1f3fd),
      //new Emoji(new int[] { 0x1f91c, 0x1f3fe }, R.drawable.emoji_ios_1f91c_1f3fe),
      //new Emoji(new int[] { 0x1f91c, 0x1f3ff }, R.drawable.emoji_ios_1f91c_1f3ff)
    ),
    new Emoji(0x1f91e, R.drawable.emoji_ios_1f91e
      //new Emoji(new int[] { 0x1f91e, 0x1f3fb }, R.drawable.emoji_ios_1f91e_1f3fb),
      //new Emoji(new int[] { 0x1f91e, 0x1f3fc }, R.drawable.emoji_ios_1f91e_1f3fc),
      //new Emoji(new int[] { 0x1f91e, 0x1f3fd }, R.drawable.emoji_ios_1f91e_1f3fd),
      //new Emoji(new int[] { 0x1f91e, 0x1f3fe }, R.drawable.emoji_ios_1f91e_1f3fe),
      //new Emoji(new int[] { 0x1f91e, 0x1f3ff }, R.drawable.emoji_ios_1f91e_1f3ff)
    ),
    new Emoji(0x270c, R.drawable.emoji_ios_270c
      //new Emoji(new int[] { 0x270c, 0x1f3fb }, R.drawable.emoji_ios_270c_1f3fb),
      //new Emoji(new int[] { 0x270c, 0x1f3fc }, R.drawable.emoji_ios_270c_1f3fc),
      //new Emoji(new int[] { 0x270c, 0x1f3fd }, R.drawable.emoji_ios_270c_1f3fd),
      //new Emoji(new int[] { 0x270c, 0x1f3fe }, R.drawable.emoji_ios_270c_1f3fe),
      //new Emoji(new int[] { 0x270c, 0x1f3ff }, R.drawable.emoji_ios_270c_1f3ff)
    ),
    new Emoji(0x1f918, R.drawable.emoji_ios_1f918
      //new Emoji(new int[] { 0x1f918, 0x1f3fb }, R.drawable.emoji_ios_1f918_1f3fb),
      //new Emoji(new int[] { 0x1f918, 0x1f3fc }, R.drawable.emoji_ios_1f918_1f3fc),
      //new Emoji(new int[] { 0x1f918, 0x1f3fd }, R.drawable.emoji_ios_1f918_1f3fd),
      //new Emoji(new int[] { 0x1f918, 0x1f3fe }, R.drawable.emoji_ios_1f918_1f3fe),
      //new Emoji(new int[] { 0x1f918, 0x1f3ff }, R.drawable.emoji_ios_1f918_1f3ff)
    ),
    new Emoji(0x1f44c, R.drawable.emoji_ios_1f44c
      //new Emoji(new int[] { 0x1f44c, 0x1f3fb }, R.drawable.emoji_ios_1f44c_1f3fb),
      //new Emoji(new int[] { 0x1f44c, 0x1f3fc }, R.drawable.emoji_ios_1f44c_1f3fc),
      //new Emoji(new int[] { 0x1f44c, 0x1f3fd }, R.drawable.emoji_ios_1f44c_1f3fd),
      //new Emoji(new int[] { 0x1f44c, 0x1f3fe }, R.drawable.emoji_ios_1f44c_1f3fe),
      //new Emoji(new int[] { 0x1f44c, 0x1f3ff }, R.drawable.emoji_ios_1f44c_1f3ff)
    ),
    new Emoji(0x1f448, R.drawable.emoji_ios_1f448
      //new Emoji(new int[] { 0x1f448, 0x1f3fb }, R.drawable.emoji_ios_1f448_1f3fb),
      //new Emoji(new int[] { 0x1f448, 0x1f3fc }, R.drawable.emoji_ios_1f448_1f3fc),
      //new Emoji(new int[] { 0x1f448, 0x1f3fd }, R.drawable.emoji_ios_1f448_1f3fd),
      //new Emoji(new int[] { 0x1f448, 0x1f3fe }, R.drawable.emoji_ios_1f448_1f3fe),
      //new Emoji(new int[] { 0x1f448, 0x1f3ff }, R.drawable.emoji_ios_1f448_1f3ff)
    ),
    new Emoji(0x1f449, R.drawable.emoji_ios_1f449
      //new Emoji(new int[] { 0x1f449, 0x1f3fb }, R.drawable.emoji_ios_1f449_1f3fb),
      //new Emoji(new int[] { 0x1f449, 0x1f3fc }, R.drawable.emoji_ios_1f449_1f3fc),
      //new Emoji(new int[] { 0x1f449, 0x1f3fd }, R.drawable.emoji_ios_1f449_1f3fd),
      //new Emoji(new int[] { 0x1f449, 0x1f3fe }, R.drawable.emoji_ios_1f449_1f3fe),
      //new Emoji(new int[] { 0x1f449, 0x1f3ff }, R.drawable.emoji_ios_1f449_1f3ff)
    ),
    new Emoji(0x1f446, R.drawable.emoji_ios_1f446
      //new Emoji(new int[] { 0x1f446, 0x1f3fb }, R.drawable.emoji_ios_1f446_1f3fb),
      //new Emoji(new int[] { 0x1f446, 0x1f3fc }, R.drawable.emoji_ios_1f446_1f3fc),
      //new Emoji(new int[] { 0x1f446, 0x1f3fd }, R.drawable.emoji_ios_1f446_1f3fd),
      //new Emoji(new int[] { 0x1f446, 0x1f3fe }, R.drawable.emoji_ios_1f446_1f3fe),
      //new Emoji(new int[] { 0x1f446, 0x1f3ff }, R.drawable.emoji_ios_1f446_1f3ff)
    ),
    new Emoji(0x1f447, R.drawable.emoji_ios_1f447
      //new Emoji(new int[] { 0x1f447, 0x1f3fb }, R.drawable.emoji_ios_1f447_1f3fb),
      //new Emoji(new int[] { 0x1f447, 0x1f3fc }, R.drawable.emoji_ios_1f447_1f3fc),
      //new Emoji(new int[] { 0x1f447, 0x1f3fd }, R.drawable.emoji_ios_1f447_1f3fd),
      //new Emoji(new int[] { 0x1f447, 0x1f3fe }, R.drawable.emoji_ios_1f447_1f3fe),
      //new Emoji(new int[] { 0x1f447, 0x1f3ff }, R.drawable.emoji_ios_1f447_1f3ff)
    ),
    new Emoji(0x261d, R.drawable.emoji_ios_261d
      //new Emoji(new int[] { 0x261d, 0x1f3fb }, R.drawable.emoji_ios_261d_1f3fb),
      //new Emoji(new int[] { 0x261d, 0x1f3fc }, R.drawable.emoji_ios_261d_1f3fc),
      //new Emoji(new int[] { 0x261d, 0x1f3fd }, R.drawable.emoji_ios_261d_1f3fd),
      //new Emoji(new int[] { 0x261d, 0x1f3fe }, R.drawable.emoji_ios_261d_1f3fe),
      //new Emoji(new int[] { 0x261d, 0x1f3ff }, R.drawable.emoji_ios_261d_1f3ff)
    ),
    new Emoji(0x270b, R.drawable.emoji_ios_270b
      //new Emoji(new int[] { 0x270b, 0x1f3fb }, R.drawable.emoji_ios_270b_1f3fb),
      //new Emoji(new int[] { 0x270b, 0x1f3fc }, R.drawable.emoji_ios_270b_1f3fc),
      //new Emoji(new int[] { 0x270b, 0x1f3fd }, R.drawable.emoji_ios_270b_1f3fd),
      //new Emoji(new int[] { 0x270b, 0x1f3fe }, R.drawable.emoji_ios_270b_1f3fe),
      //new Emoji(new int[] { 0x270b, 0x1f3ff }, R.drawable.emoji_ios_270b_1f3ff)
    ),
    new Emoji(0x1f91a, R.drawable.emoji_ios_1f91a
      //new Emoji(new int[] { 0x1f91a, 0x1f3fb }, R.drawable.emoji_ios_1f91a_1f3fb),
      //new Emoji(new int[] { 0x1f91a, 0x1f3fc }, R.drawable.emoji_ios_1f91a_1f3fc),
      //new Emoji(new int[] { 0x1f91a, 0x1f3fd }, R.drawable.emoji_ios_1f91a_1f3fd),
      //new Emoji(new int[] { 0x1f91a, 0x1f3fe }, R.drawable.emoji_ios_1f91a_1f3fe),
      //new Emoji(new int[] { 0x1f91a, 0x1f3ff }, R.drawable.emoji_ios_1f91a_1f3ff)
    ),
    new Emoji(0x1f590, R.drawable.emoji_ios_1f590
      //new Emoji(new int[] { 0x1f590, 0x1f3fb }, R.drawable.emoji_ios_1f590_1f3fb),
      //new Emoji(new int[] { 0x1f590, 0x1f3fc }, R.drawable.emoji_ios_1f590_1f3fc),
      //new Emoji(new int[] { 0x1f590, 0x1f3fd }, R.drawable.emoji_ios_1f590_1f3fd),
      //new Emoji(new int[] { 0x1f590, 0x1f3fe }, R.drawable.emoji_ios_1f590_1f3fe),
      //new Emoji(new int[] { 0x1f590, 0x1f3ff }, R.drawable.emoji_ios_1f590_1f3ff)
    ),
    new Emoji(0x1f596, R.drawable.emoji_ios_1f596
      //new Emoji(new int[] { 0x1f596, 0x1f3fb }, R.drawable.emoji_ios_1f596_1f3fb),
      //new Emoji(new int[] { 0x1f596, 0x1f3fc }, R.drawable.emoji_ios_1f596_1f3fc),
      //new Emoji(new int[] { 0x1f596, 0x1f3fd }, R.drawable.emoji_ios_1f596_1f3fd),
      //new Emoji(new int[] { 0x1f596, 0x1f3fe }, R.drawable.emoji_ios_1f596_1f3fe),
      //new Emoji(new int[] { 0x1f596, 0x1f3ff }, R.drawable.emoji_ios_1f596_1f3ff)
    ),
    new Emoji(0x1f44b, R.drawable.emoji_ios_1f44b
      //new Emoji(new int[] { 0x1f44b, 0x1f3fb }, R.drawable.emoji_ios_1f44b_1f3fb),
      //new Emoji(new int[] { 0x1f44b, 0x1f3fc }, R.drawable.emoji_ios_1f44b_1f3fc),
      //new Emoji(new int[] { 0x1f44b, 0x1f3fd }, R.drawable.emoji_ios_1f44b_1f3fd),
      //new Emoji(new int[] { 0x1f44b, 0x1f3fe }, R.drawable.emoji_ios_1f44b_1f3fe),
      //new Emoji(new int[] { 0x1f44b, 0x1f3ff }, R.drawable.emoji_ios_1f44b_1f3ff)
    ),
    new Emoji(0x1f919, R.drawable.emoji_ios_1f919
      //new Emoji(new int[] { 0x1f919, 0x1f3fb }, R.drawable.emoji_ios_1f919_1f3fb),
      //new Emoji(new int[] { 0x1f919, 0x1f3fc }, R.drawable.emoji_ios_1f919_1f3fc),
      //new Emoji(new int[] { 0x1f919, 0x1f3fd }, R.drawable.emoji_ios_1f919_1f3fd),
      //new Emoji(new int[] { 0x1f919, 0x1f3fe }, R.drawable.emoji_ios_1f919_1f3fe),
      //new Emoji(new int[] { 0x1f919, 0x1f3ff }, R.drawable.emoji_ios_1f919_1f3ff)
    ),
    //new Emoji(0x1f4aa, R.drawable.emoji_ios_1f4aa,
    //  new Emoji(new int[] { 0x1f4aa, 0x1f3fb }, R.drawable.emoji_ios_1f4aa_1f3fb),
    //  new Emoji(new int[] { 0x1f4aa, 0x1f3fc }, R.drawable.emoji_ios_1f4aa_1f3fc),
    //  new Emoji(new int[] { 0x1f4aa, 0x1f3fd }, R.drawable.emoji_ios_1f4aa_1f3fd),
    //  new Emoji(new int[] { 0x1f4aa, 0x1f3fe }, R.drawable.emoji_ios_1f4aa_1f3fe),
    //  new Emoji(new int[] { 0x1f4aa, 0x1f3ff }, R.drawable.emoji_ios_1f4aa_1f3ff)
    //),
    new Emoji(0x1f595, R.drawable.emoji_ios_1f595
      //new Emoji(new int[] { 0x1f595, 0x1f3fb }, R.drawable.emoji_ios_1f595_1f3fb),
      //new Emoji(new int[] { 0x1f595, 0x1f3fc }, R.drawable.emoji_ios_1f595_1f3fc),
      //new Emoji(new int[] { 0x1f595, 0x1f3fd }, R.drawable.emoji_ios_1f595_1f3fd),
      //new Emoji(new int[] { 0x1f595, 0x1f3fe }, R.drawable.emoji_ios_1f595_1f3fe),
      //new Emoji(new int[] { 0x1f595, 0x1f3ff }, R.drawable.emoji_ios_1f595_1f3ff)
    ),
    new Emoji(0x270d, R.drawable.emoji_ios_270d
      //new Emoji(new int[] { 0x270d, 0x1f3fb }, R.drawable.emoji_ios_270d_1f3fb),
      //new Emoji(new int[] { 0x270d, 0x1f3fc }, R.drawable.emoji_ios_270d_1f3fc),
      //new Emoji(new int[] { 0x270d, 0x1f3fd }, R.drawable.emoji_ios_270d_1f3fd),
      //new Emoji(new int[] { 0x270d, 0x1f3fe }, R.drawable.emoji_ios_270d_1f3fe),
      //new Emoji(new int[] { 0x270d, 0x1f3ff }, R.drawable.emoji_ios_270d_1f3ff)
    ),
    //new Emoji(0x1f933, R.drawable.emoji_ios_1f933,
    //  new Emoji(new int[] { 0x1f933, 0x1f3fb }, R.drawable.emoji_ios_1f933_1f3fb),
    //  new Emoji(new int[] { 0x1f933, 0x1f3fc }, R.drawable.emoji_ios_1f933_1f3fc),
    //  new Emoji(new int[] { 0x1f933, 0x1f3fd }, R.drawable.emoji_ios_1f933_1f3fd),
    //  new Emoji(new int[] { 0x1f933, 0x1f3fe }, R.drawable.emoji_ios_1f933_1f3fe),
    //  new Emoji(new int[] { 0x1f933, 0x1f3ff }, R.drawable.emoji_ios_1f933_1f3ff)
    //),
    new Emoji(0x1f485, R.drawable.emoji_ios_1f485
      //new Emoji(new int[] { 0x1f485, 0x1f3fb }, R.drawable.emoji_ios_1f485_1f3fb),
      //new Emoji(new int[] { 0x1f485, 0x1f3fc }, R.drawable.emoji_ios_1f485_1f3fc),
      //new Emoji(new int[] { 0x1f485, 0x1f3fd }, R.drawable.emoji_ios_1f485_1f3fd),
      //new Emoji(new int[] { 0x1f485, 0x1f3fe }, R.drawable.emoji_ios_1f485_1f3fe),
      //new Emoji(new int[] { 0x1f485, 0x1f3ff }, R.drawable.emoji_ios_1f485_1f3ff)
    ),
    new Emoji(0x1f48d, R.drawable.emoji_ios_1f48d),
    new Emoji(0x1f484, R.drawable.emoji_ios_1f484),
    new Emoji(0x1f48b, R.drawable.emoji_ios_1f48b),
    //new Emoji(0x1f444, R.drawable.emoji_ios_1f444),
    //new Emoji(0x1f445, R.drawable.emoji_ios_1f445),
    new Emoji(0x1f442, R.drawable.emoji_ios_1f442
      //new Emoji(new int[] { 0x1f442, 0x1f3fb }, R.drawable.emoji_ios_1f442_1f3fb),
      //new Emoji(new int[] { 0x1f442, 0x1f3fc }, R.drawable.emoji_ios_1f442_1f3fc),
      //new Emoji(new int[] { 0x1f442, 0x1f3fd }, R.drawable.emoji_ios_1f442_1f3fd),
      //new Emoji(new int[] { 0x1f442, 0x1f3fe }, R.drawable.emoji_ios_1f442_1f3fe),
      //new Emoji(new int[] { 0x1f442, 0x1f3ff }, R.drawable.emoji_ios_1f442_1f3ff)
    ),
    new Emoji(0x1f443, R.drawable.emoji_ios_1f443
      //new Emoji(new int[] { 0x1f443, 0x1f3fb }, R.drawable.emoji_ios_1f443_1f3fb),
      //new Emoji(new int[] { 0x1f443, 0x1f3fc }, R.drawable.emoji_ios_1f443_1f3fc),
      //new Emoji(new int[] { 0x1f443, 0x1f3fd }, R.drawable.emoji_ios_1f443_1f3fd),
      //new Emoji(new int[] { 0x1f443, 0x1f3fe }, R.drawable.emoji_ios_1f443_1f3fe),
      //new Emoji(new int[] { 0x1f443, 0x1f3ff }, R.drawable.emoji_ios_1f443_1f3ff)
    ),
    new Emoji(0x1f463, R.drawable.emoji_ios_1f463),
    new Emoji(0x1f441, R.drawable.emoji_ios_1f441),
    new Emoji(0x1f440, R.drawable.emoji_ios_1f440),
    //new Emoji(0x1f5e3, R.drawable.emoji_ios_1f5e3),
    //new Emoji(0x1f464, R.drawable.emoji_ios_1f464),
    //new Emoji(0x1f465, R.drawable.emoji_ios_1f465),
    new Emoji(0x1f476, R.drawable.emoji_ios_1f476
      //new Emoji(new int[] { 0x1f476, 0x1f3fb }, R.drawable.emoji_ios_1f476_1f3fb),
      //new Emoji(new int[] { 0x1f476, 0x1f3fc }, R.drawable.emoji_ios_1f476_1f3fc),
      //new Emoji(new int[] { 0x1f476, 0x1f3fd }, R.drawable.emoji_ios_1f476_1f3fd),
      //new Emoji(new int[] { 0x1f476, 0x1f3fe }, R.drawable.emoji_ios_1f476_1f3fe),
      //new Emoji(new int[] { 0x1f476, 0x1f3ff }, R.drawable.emoji_ios_1f476_1f3ff)
    ),
    new Emoji(0x1f466, R.drawable.emoji_ios_1f466
      //new Emoji(new int[] { 0x1f466, 0x1f3fb }, R.drawable.emoji_ios_1f466_1f3fb),
      //new Emoji(new int[] { 0x1f466, 0x1f3fc }, R.drawable.emoji_ios_1f466_1f3fc),
      //new Emoji(new int[] { 0x1f466, 0x1f3fd }, R.drawable.emoji_ios_1f466_1f3fd),
      //new Emoji(new int[] { 0x1f466, 0x1f3fe }, R.drawable.emoji_ios_1f466_1f3fe),
      //new Emoji(new int[] { 0x1f466, 0x1f3ff }, R.drawable.emoji_ios_1f466_1f3ff)
    ),
    new Emoji(0x1f467, R.drawable.emoji_ios_1f467
      //new Emoji(new int[] { 0x1f467, 0x1f3fb }, R.drawable.emoji_ios_1f467_1f3fb),
      //new Emoji(new int[] { 0x1f467, 0x1f3fc }, R.drawable.emoji_ios_1f467_1f3fc),
      //new Emoji(new int[] { 0x1f467, 0x1f3fd }, R.drawable.emoji_ios_1f467_1f3fd),
      //new Emoji(new int[] { 0x1f467, 0x1f3fe }, R.drawable.emoji_ios_1f467_1f3fe),
      //new Emoji(new int[] { 0x1f467, 0x1f3ff }, R.drawable.emoji_ios_1f467_1f3ff)
    ),
    new Emoji(0x1f468, R.drawable.emoji_ios_1f468
      //new Emoji(new int[] { 0x1f468, 0x1f3fb }, R.drawable.emoji_ios_1f468_1f3fb),
      //new Emoji(new int[] { 0x1f468, 0x1f3fc }, R.drawable.emoji_ios_1f468_1f3fc),
      //new Emoji(new int[] { 0x1f468, 0x1f3fd }, R.drawable.emoji_ios_1f468_1f3fd),
      //new Emoji(new int[] { 0x1f468, 0x1f3fe }, R.drawable.emoji_ios_1f468_1f3fe),
      //new Emoji(new int[] { 0x1f468, 0x1f3ff }, R.drawable.emoji_ios_1f468_1f3ff)
    ),
    new Emoji(0x1f469, R.drawable.emoji_ios_1f469
      //new Emoji(new int[] { 0x1f469, 0x1f3fb }, R.drawable.emoji_ios_1f469_1f3fb),
      //new Emoji(new int[] { 0x1f469, 0x1f3fc }, R.drawable.emoji_ios_1f469_1f3fc),
      //new Emoji(new int[] { 0x1f469, 0x1f3fd }, R.drawable.emoji_ios_1f469_1f3fd),
      //new Emoji(new int[] { 0x1f469, 0x1f3fe }, R.drawable.emoji_ios_1f469_1f3fe),
      //new Emoji(new int[] { 0x1f469, 0x1f3ff }, R.drawable.emoji_ios_1f469_1f3ff)
    ),
    //new Emoji(new int[] { 0x1f471, 0x200d, 0x2640, 0xfe0f }, R.drawable.emoji_ios_1f471_200d_2640_fe0f,
    //  new Emoji(new int[] { 0x1f471, 0x1f3fb, 0x200d, 0x2640, 0xfe0f }, R.drawable.emoji_ios_1f471_1f3fb_200d_2640_fe0f),
    //  new Emoji(new int[] { 0x1f471, 0x1f3fc, 0x200d, 0x2640, 0xfe0f }, R.drawable.emoji_ios_1f471_1f3fc_200d_2640_fe0f),
    //  new Emoji(new int[] { 0x1f471, 0x1f3fd, 0x200d, 0x2640, 0xfe0f }, R.drawable.emoji_ios_1f471_1f3fd_200d_2640_fe0f),
    //  new Emoji(new int[] { 0x1f471, 0x1f3fe, 0x200d, 0x2640, 0xfe0f }, R.drawable.emoji_ios_1f471_1f3fe_200d_2640_fe0f),
    //  new Emoji(new int[] { 0x1f471, 0x1f3ff, 0x200d, 0x2640, 0xfe0f }, R.drawable.emoji_ios_1f471_1f3ff_200d_2640_fe0f)
    //),
    new Emoji(0x1f471, R.drawable.emoji_ios_1f471
      //new Emoji(new int[] { 0x1f471, 0x1f3fb }, R.drawable.emoji_ios_1f471_1f3fb),
      //new Emoji(new int[] { 0x1f471, 0x1f3fc }, R.drawable.emoji_ios_1f471_1f3fc),
      //new Emoji(new int[] { 0x1f471, 0x1f3fd }, R.drawable.emoji_ios_1f471_1f3fd),
      //new Emoji(new int[] { 0x1f471, 0x1f3fe }, R.drawable.emoji_ios_1f471_1f3fe),
      //new Emoji(new int[] { 0x1f471, 0x1f3ff }, R.drawable.emoji_ios_1f471_1f3ff)
    ),
    new Emoji(0x1f474, R.drawable.emoji_ios_1f474
      //new Emoji(new int[] { 0x1f474, 0x1f3fb }, R.drawable.emoji_ios_1f474_1f3fb),
      //new Emoji(new int[] { 0x1f474, 0x1f3fc }, R.drawable.emoji_ios_1f474_1f3fc),
      //new Emoji(new int[] { 0x1f474, 0x1f3fd }, R.drawable.emoji_ios_1f474_1f3fd),
      //new Emoji(new int[] { 0x1f474, 0x1f3fe }, R.drawable.emoji_ios_1f474_1f3fe),
      //new Emoji(new int[] { 0x1f474, 0x1f3ff }, R.drawable.emoji_ios_1f474_1f3ff)
    ),
    new Emoji(0x1f475, R.drawable.emoji_ios_1f475
      //new Emoji(new int[] { 0x1f475, 0x1f3fb }, R.drawable.emoji_ios_1f475_1f3fb),
      //new Emoji(new int[] { 0x1f475, 0x1f3fc }, R.drawable.emoji_ios_1f475_1f3fc),
      //new Emoji(new int[] { 0x1f475, 0x1f3fd }, R.drawable.emoji_ios_1f475_1f3fd),
      //new Emoji(new int[] { 0x1f475, 0x1f3fe }, R.drawable.emoji_ios_1f475_1f3fe),
      //new Emoji(new int[] { 0x1f475, 0x1f3ff }, R.drawable.emoji_ios_1f475_1f3ff)
    ),
    //new Emoji(0x1f472, R.drawable.emoji_ios_1f472,
    //  new Emoji(new int[] { 0x1f472, 0x1f3fb }, R.drawable.emoji_ios_1f472_1f3fb),
    //  new Emoji(new int[] { 0x1f472, 0x1f3fc }, R.drawable.emoji_ios_1f472_1f3fc),
    //  new Emoji(new int[] { 0x1f472, 0x1f3fd }, R.drawable.emoji_ios_1f472_1f3fd),
    //  new Emoji(new int[] { 0x1f472, 0x1f3fe }, R.drawable.emoji_ios_1f472_1f3fe),
    //  new Emoji(new int[] { 0x1f472, 0x1f3ff }, R.drawable.emoji_ios_1f472_1f3ff)
    //),
    //new Emoji(new int[] { 0x1f473, 0x200d, 0x2640, 0xfe0f }, R.drawable.emoji_ios_1f473_200d_2640_fe0f,
    //  new Emoji(new int[] { 0x1f473, 0x1f3fb, 0x200d, 0x2640, 0xfe0f }, R.drawable.emoji_ios_1f473_1f3fb_200d_2640_fe0f),
    //  new Emoji(new int[] { 0x1f473, 0x1f3fc, 0x200d, 0x2640, 0xfe0f }, R.drawable.emoji_ios_1f473_1f3fc_200d_2640_fe0f),
    //  new Emoji(new int[] { 0x1f473, 0x1f3fd, 0x200d, 0x2640, 0xfe0f }, R.drawable.emoji_ios_1f473_1f3fd_200d_2640_fe0f),
    //  new Emoji(new int[] { 0x1f473, 0x1f3fe, 0x200d, 0x2640, 0xfe0f }, R.drawable.emoji_ios_1f473_1f3fe_200d_2640_fe0f),
    //  new Emoji(new int[] { 0x1f473, 0x1f3ff, 0x200d, 0x2640, 0xfe0f }, R.drawable.emoji_ios_1f473_1f3ff_200d_2640_fe0f)
    //),
    //new Emoji(0x1f473, R.drawable.emoji_ios_1f473,
    //  new Emoji(new int[] { 0x1f473, 0x1f3fb }, R.drawable.emoji_ios_1f473_1f3fb),
    //  new Emoji(new int[] { 0x1f473, 0x1f3fc }, R.drawable.emoji_ios_1f473_1f3fc),
    //  new Emoji(new int[] { 0x1f473, 0x1f3fd }, R.drawable.emoji_ios_1f473_1f3fd),
    //  new Emoji(new int[] { 0x1f473, 0x1f3fe }, R.drawable.emoji_ios_1f473_1f3fe),
    //  new Emoji(new int[] { 0x1f473, 0x1f3ff }, R.drawable.emoji_ios_1f473_1f3ff)
    //),
    //new Emoji(new int[] { 0x1f46e, 0x200d, 0x2640, 0xfe0f }, R.drawable.emoji_ios_1f46e_200d_2640_fe0f,
    //  new Emoji(new int[] { 0x1f46e, 0x1f3fb, 0x200d, 0x2640, 0xfe0f }, R.drawable.emoji_ios_1f46e_1f3fb_200d_2640_fe0f),
    //  new Emoji(new int[] { 0x1f46e, 0x1f3fc, 0x200d, 0x2640, 0xfe0f }, R.drawable.emoji_ios_1f46e_1f3fc_200d_2640_fe0f),
    //  new Emoji(new int[] { 0x1f46e, 0x1f3fd, 0x200d, 0x2640, 0xfe0f }, R.drawable.emoji_ios_1f46e_1f3fd_200d_2640_fe0f),
    //  new Emoji(new int[] { 0x1f46e, 0x1f3fe, 0x200d, 0x2640, 0xfe0f }, R.drawable.emoji_ios_1f46e_1f3fe_200d_2640_fe0f),
    //  new Emoji(new int[] { 0x1f46e, 0x1f3ff, 0x200d, 0x2640, 0xfe0f }, R.drawable.emoji_ios_1f46e_1f3ff_200d_2640_fe0f)
    //),
    //new Emoji(0x1f46e, R.drawable.emoji_ios_1f46e,
    //  new Emoji(new int[] { 0x1f46e, 0x1f3fb }, R.drawable.emoji_ios_1f46e_1f3fb),
    //  new Emoji(new int[] { 0x1f46e, 0x1f3fc }, R.drawable.emoji_ios_1f46e_1f3fc),
    //  new Emoji(new int[] { 0x1f46e, 0x1f3fd }, R.drawable.emoji_ios_1f46e_1f3fd),
    //  new Emoji(new int[] { 0x1f46e, 0x1f3fe }, R.drawable.emoji_ios_1f46e_1f3fe),
    //  new Emoji(new int[] { 0x1f46e, 0x1f3ff }, R.drawable.emoji_ios_1f46e_1f3ff)
    //),
    new Emoji(new int[] { 0x1f477, 0x200d, 0x2640, 0xfe0f }, R.drawable.emoji_ios_1f477_200d_2640_fe0f
      //new Emoji(new int[] { 0x1f477, 0x1f3fb, 0x200d, 0x2640, 0xfe0f }, R.drawable.emoji_ios_1f477_1f3fb_200d_2640_fe0f),
      //new Emoji(new int[] { 0x1f477, 0x1f3fc, 0x200d, 0x2640, 0xfe0f }, R.drawable.emoji_ios_1f477_1f3fc_200d_2640_fe0f),
      //new Emoji(new int[] { 0x1f477, 0x1f3fd, 0x200d, 0x2640, 0xfe0f }, R.drawable.emoji_ios_1f477_1f3fd_200d_2640_fe0f),
      //new Emoji(new int[] { 0x1f477, 0x1f3fe, 0x200d, 0x2640, 0xfe0f }, R.drawable.emoji_ios_1f477_1f3fe_200d_2640_fe0f),
      //new Emoji(new int[] { 0x1f477, 0x1f3ff, 0x200d, 0x2640, 0xfe0f }, R.drawable.emoji_ios_1f477_1f3ff_200d_2640_fe0f)
    ),
    new Emoji(0x1f477, R.drawable.emoji_ios_1f477
      //new Emoji(new int[] { 0x1f477, 0x1f3fb }, R.drawable.emoji_ios_1f477_1f3fb),
      //new Emoji(new int[] { 0x1f477, 0x1f3fc }, R.drawable.emoji_ios_1f477_1f3fc),
      //new Emoji(new int[] { 0x1f477, 0x1f3fd }, R.drawable.emoji_ios_1f477_1f3fd),
      //new Emoji(new int[] { 0x1f477, 0x1f3fe }, R.drawable.emoji_ios_1f477_1f3fe),
      //new Emoji(new int[] { 0x1f477, 0x1f3ff }, R.drawable.emoji_ios_1f477_1f3ff)
    ),
    //new Emoji(new int[] { 0x1f482, 0x200d, 0x2640, 0xfe0f }, R.drawable.emoji_ios_1f482_200d_2640_fe0f,
    //  new Emoji(new int[] { 0x1f482, 0x1f3fb, 0x200d, 0x2640, 0xfe0f }, R.drawable.emoji_ios_1f482_1f3fb_200d_2640_fe0f),
    //  new Emoji(new int[] { 0x1f482, 0x1f3fc, 0x200d, 0x2640, 0xfe0f }, R.drawable.emoji_ios_1f482_1f3fc_200d_2640_fe0f),
    //  new Emoji(new int[] { 0x1f482, 0x1f3fd, 0x200d, 0x2640, 0xfe0f }, R.drawable.emoji_ios_1f482_1f3fd_200d_2640_fe0f),
    //  new Emoji(new int[] { 0x1f482, 0x1f3fe, 0x200d, 0x2640, 0xfe0f }, R.drawable.emoji_ios_1f482_1f3fe_200d_2640_fe0f),
    //  new Emoji(new int[] { 0x1f482, 0x1f3ff, 0x200d, 0x2640, 0xfe0f }, R.drawable.emoji_ios_1f482_1f3ff_200d_2640_fe0f)
    //),
    //new Emoji(0x1f482, R.drawable.emoji_ios_1f482,
    //  new Emoji(new int[] { 0x1f482, 0x1f3fb }, R.drawable.emoji_ios_1f482_1f3fb),
    //  new Emoji(new int[] { 0x1f482, 0x1f3fc }, R.drawable.emoji_ios_1f482_1f3fc),
    //  new Emoji(new int[] { 0x1f482, 0x1f3fd }, R.drawable.emoji_ios_1f482_1f3fd),
    //  new Emoji(new int[] { 0x1f482, 0x1f3fe }, R.drawable.emoji_ios_1f482_1f3fe),
    //  new Emoji(new int[] { 0x1f482, 0x1f3ff }, R.drawable.emoji_ios_1f482_1f3ff)
    //),
    //new Emoji(new int[] { 0x1f575, 0xfe0f, 0x200d, 0x2640, 0xfe0f }, R.drawable.emoji_ios_1f575_fe0f_200d_2640_fe0f,
    //  new Emoji(new int[] { 0x1f575, 0x1f3fb, 0x200d, 0x2640, 0xfe0f }, R.drawable.emoji_ios_1f575_1f3fb_200d_2640_fe0f),
    //  new Emoji(new int[] { 0x1f575, 0x1f3fc, 0x200d, 0x2640, 0xfe0f }, R.drawable.emoji_ios_1f575_1f3fc_200d_2640_fe0f),
    //  new Emoji(new int[] { 0x1f575, 0x1f3fd, 0x200d, 0x2640, 0xfe0f }, R.drawable.emoji_ios_1f575_1f3fd_200d_2640_fe0f),
    //  new Emoji(new int[] { 0x1f575, 0x1f3fe, 0x200d, 0x2640, 0xfe0f }, R.drawable.emoji_ios_1f575_1f3fe_200d_2640_fe0f),
    //  new Emoji(new int[] { 0x1f575, 0x1f3ff, 0x200d, 0x2640, 0xfe0f }, R.drawable.emoji_ios_1f575_1f3ff_200d_2640_fe0f)
    //),
    //new Emoji(0x1f575, R.drawable.emoji_ios_1f575,
    //  new Emoji(new int[] { 0x1f575, 0x1f3fb }, R.drawable.emoji_ios_1f575_1f3fb),
    //  new Emoji(new int[] { 0x1f575, 0x1f3fc }, R.drawable.emoji_ios_1f575_1f3fc),
    //  new Emoji(new int[] { 0x1f575, 0x1f3fd }, R.drawable.emoji_ios_1f575_1f3fd),
    //  new Emoji(new int[] { 0x1f575, 0x1f3fe }, R.drawable.emoji_ios_1f575_1f3fe),
    //  new Emoji(new int[] { 0x1f575, 0x1f3ff }, R.drawable.emoji_ios_1f575_1f3ff)
    //),
    new Emoji(new int[] { 0x1f469, 0x200d, 0x2695, 0xfe0f }, R.drawable.emoji_ios_1f469_200d_2695_fe0f
      //new Emoji(new int[] { 0x1f469, 0x1f3fb, 0x200d, 0x2695, 0xfe0f }, R.drawable.emoji_ios_1f469_1f3fb_200d_2695_fe0f),
      //new Emoji(new int[] { 0x1f469, 0x1f3fc, 0x200d, 0x2695, 0xfe0f }, R.drawable.emoji_ios_1f469_1f3fc_200d_2695_fe0f),
      //new Emoji(new int[] { 0x1f469, 0x1f3fd, 0x200d, 0x2695, 0xfe0f }, R.drawable.emoji_ios_1f469_1f3fd_200d_2695_fe0f),
      //new Emoji(new int[] { 0x1f469, 0x1f3fe, 0x200d, 0x2695, 0xfe0f }, R.drawable.emoji_ios_1f469_1f3fe_200d_2695_fe0f),
      //new Emoji(new int[] { 0x1f469, 0x1f3ff, 0x200d, 0x2695, 0xfe0f }, R.drawable.emoji_ios_1f469_1f3ff_200d_2695_fe0f)
    ),
    new Emoji(new int[] { 0x1f468, 0x200d, 0x2695, 0xfe0f }, R.drawable.emoji_ios_1f468_200d_2695_fe0f
      //new Emoji(new int[] { 0x1f468, 0x1f3fb, 0x200d, 0x2695, 0xfe0f }, R.drawable.emoji_ios_1f468_1f3fb_200d_2695_fe0f),
      //new Emoji(new int[] { 0x1f468, 0x1f3fc, 0x200d, 0x2695, 0xfe0f }, R.drawable.emoji_ios_1f468_1f3fc_200d_2695_fe0f),
      //new Emoji(new int[] { 0x1f468, 0x1f3fd, 0x200d, 0x2695, 0xfe0f }, R.drawable.emoji_ios_1f468_1f3fd_200d_2695_fe0f),
      //new Emoji(new int[] { 0x1f468, 0x1f3fe, 0x200d, 0x2695, 0xfe0f }, R.drawable.emoji_ios_1f468_1f3fe_200d_2695_fe0f),
      //new Emoji(new int[] { 0x1f468, 0x1f3ff, 0x200d, 0x2695, 0xfe0f }, R.drawable.emoji_ios_1f468_1f3ff_200d_2695_fe0f)
    ),
    new Emoji(new int[] { 0x1f469, 0x200d, 0x1f33e }, R.drawable.emoji_ios_1f469_200d_1f33e
      //new Emoji(new int[] { 0x1f469, 0x1f3fb, 0x200d, 0x1f33e }, R.drawable.emoji_ios_1f469_1f3fb_200d_1f33e),
      //new Emoji(new int[] { 0x1f469, 0x1f3fc, 0x200d, 0x1f33e }, R.drawable.emoji_ios_1f469_1f3fc_200d_1f33e),
      //new Emoji(new int[] { 0x1f469, 0x1f3fd, 0x200d, 0x1f33e }, R.drawable.emoji_ios_1f469_1f3fd_200d_1f33e),
      //new Emoji(new int[] { 0x1f469, 0x1f3fe, 0x200d, 0x1f33e }, R.drawable.emoji_ios_1f469_1f3fe_200d_1f33e),
      //new Emoji(new int[] { 0x1f469, 0x1f3ff, 0x200d, 0x1f33e }, R.drawable.emoji_ios_1f469_1f3ff_200d_1f33e)
    ),
    new Emoji(new int[] { 0x1f468, 0x200d, 0x1f33e }, R.drawable.emoji_ios_1f468_200d_1f33e
      //new Emoji(new int[] { 0x1f468, 0x1f3fb, 0x200d, 0x1f33e }, R.drawable.emoji_ios_1f468_1f3fb_200d_1f33e),
      //new Emoji(new int[] { 0x1f468, 0x1f3fc, 0x200d, 0x1f33e }, R.drawable.emoji_ios_1f468_1f3fc_200d_1f33e),
      //new Emoji(new int[] { 0x1f468, 0x1f3fd, 0x200d, 0x1f33e }, R.drawable.emoji_ios_1f468_1f3fd_200d_1f33e),
      //new Emoji(new int[] { 0x1f468, 0x1f3fe, 0x200d, 0x1f33e }, R.drawable.emoji_ios_1f468_1f3fe_200d_1f33e),
      //new Emoji(new int[] { 0x1f468, 0x1f3ff, 0x200d, 0x1f33e }, R.drawable.emoji_ios_1f468_1f3ff_200d_1f33e)
    ),
    new Emoji(new int[] { 0x1f469, 0x200d, 0x1f373 }, R.drawable.emoji_ios_1f469_200d_1f373
      //new Emoji(new int[] { 0x1f469, 0x1f3fb, 0x200d, 0x1f373 }, R.drawable.emoji_ios_1f469_1f3fb_200d_1f373),
      //new Emoji(new int[] { 0x1f469, 0x1f3fc, 0x200d, 0x1f373 }, R.drawable.emoji_ios_1f469_1f3fc_200d_1f373),
      //new Emoji(new int[] { 0x1f469, 0x1f3fd, 0x200d, 0x1f373 }, R.drawable.emoji_ios_1f469_1f3fd_200d_1f373),
      //new Emoji(new int[] { 0x1f469, 0x1f3fe, 0x200d, 0x1f373 }, R.drawable.emoji_ios_1f469_1f3fe_200d_1f373),
      //new Emoji(new int[] { 0x1f469, 0x1f3ff, 0x200d, 0x1f373 }, R.drawable.emoji_ios_1f469_1f3ff_200d_1f373)
    ),
    new Emoji(new int[] { 0x1f468, 0x200d, 0x1f373 }, R.drawable.emoji_ios_1f468_200d_1f373
      //new Emoji(new int[] { 0x1f468, 0x1f3fb, 0x200d, 0x1f373 }, R.drawable.emoji_ios_1f468_1f3fb_200d_1f373),
      //new Emoji(new int[] { 0x1f468, 0x1f3fc, 0x200d, 0x1f373 }, R.drawable.emoji_ios_1f468_1f3fc_200d_1f373),
      //new Emoji(new int[] { 0x1f468, 0x1f3fd, 0x200d, 0x1f373 }, R.drawable.emoji_ios_1f468_1f3fd_200d_1f373),
      //new Emoji(new int[] { 0x1f468, 0x1f3fe, 0x200d, 0x1f373 }, R.drawable.emoji_ios_1f468_1f3fe_200d_1f373),
      //new Emoji(new int[] { 0x1f468, 0x1f3ff, 0x200d, 0x1f373 }, R.drawable.emoji_ios_1f468_1f3ff_200d_1f373)
    ),
    new Emoji(new int[] { 0x1f469, 0x200d, 0x1f393 }, R.drawable.emoji_ios_1f469_200d_1f393
      //new Emoji(new int[] { 0x1f469, 0x1f3fb, 0x200d, 0x1f393 }, R.drawable.emoji_ios_1f469_1f3fb_200d_1f393),
      //new Emoji(new int[] { 0x1f469, 0x1f3fc, 0x200d, 0x1f393 }, R.drawable.emoji_ios_1f469_1f3fc_200d_1f393),
      //new Emoji(new int[] { 0x1f469, 0x1f3fd, 0x200d, 0x1f393 }, R.drawable.emoji_ios_1f469_1f3fd_200d_1f393),
      //new Emoji(new int[] { 0x1f469, 0x1f3fe, 0x200d, 0x1f393 }, R.drawable.emoji_ios_1f469_1f3fe_200d_1f393),
      //new Emoji(new int[] { 0x1f469, 0x1f3ff, 0x200d, 0x1f393 }, R.drawable.emoji_ios_1f469_1f3ff_200d_1f393)
    ),
    new Emoji(new int[] { 0x1f468, 0x200d, 0x1f393 }, R.drawable.emoji_ios_1f468_200d_1f393
      //new Emoji(new int[] { 0x1f468, 0x1f3fb, 0x200d, 0x1f393 }, R.drawable.emoji_ios_1f468_1f3fb_200d_1f393),
      //new Emoji(new int[] { 0x1f468, 0x1f3fc, 0x200d, 0x1f393 }, R.drawable.emoji_ios_1f468_1f3fc_200d_1f393),
      //new Emoji(new int[] { 0x1f468, 0x1f3fd, 0x200d, 0x1f393 }, R.drawable.emoji_ios_1f468_1f3fd_200d_1f393),
      //new Emoji(new int[] { 0x1f468, 0x1f3fe, 0x200d, 0x1f393 }, R.drawable.emoji_ios_1f468_1f3fe_200d_1f393),
      //new Emoji(new int[] { 0x1f468, 0x1f3ff, 0x200d, 0x1f393 }, R.drawable.emoji_ios_1f468_1f3ff_200d_1f393)
    ),
    new Emoji(new int[] { 0x1f469, 0x200d, 0x1f3a4 }, R.drawable.emoji_ios_1f469_200d_1f3a4
      //new Emoji(new int[] { 0x1f469, 0x1f3fb, 0x200d, 0x1f3a4 }, R.drawable.emoji_ios_1f469_1f3fb_200d_1f3a4),
      //new Emoji(new int[] { 0x1f469, 0x1f3fc, 0x200d, 0x1f3a4 }, R.drawable.emoji_ios_1f469_1f3fc_200d_1f3a4),
      //new Emoji(new int[] { 0x1f469, 0x1f3fd, 0x200d, 0x1f3a4 }, R.drawable.emoji_ios_1f469_1f3fd_200d_1f3a4),
      //new Emoji(new int[] { 0x1f469, 0x1f3fe, 0x200d, 0x1f3a4 }, R.drawable.emoji_ios_1f469_1f3fe_200d_1f3a4),
      //new Emoji(new int[] { 0x1f469, 0x1f3ff, 0x200d, 0x1f3a4 }, R.drawable.emoji_ios_1f469_1f3ff_200d_1f3a4)
    ),
    //new Emoji(new int[] { 0x1f468, 0x200d, 0x1f3a4 }, R.drawable.emoji_ios_1f468_200d_1f3a4,
    //  new Emoji(new int[] { 0x1f468, 0x1f3fb, 0x200d, 0x1f3a4 }, R.drawable.emoji_ios_1f468_1f3fb_200d_1f3a4),
    //  new Emoji(new int[] { 0x1f468, 0x1f3fc, 0x200d, 0x1f3a4 }, R.drawable.emoji_ios_1f468_1f3fc_200d_1f3a4),
    //  new Emoji(new int[] { 0x1f468, 0x1f3fd, 0x200d, 0x1f3a4 }, R.drawable.emoji_ios_1f468_1f3fd_200d_1f3a4),
    //  new Emoji(new int[] { 0x1f468, 0x1f3fe, 0x200d, 0x1f3a4 }, R.drawable.emoji_ios_1f468_1f3fe_200d_1f3a4),
    //  new Emoji(new int[] { 0x1f468, 0x1f3ff, 0x200d, 0x1f3a4 }, R.drawable.emoji_ios_1f468_1f3ff_200d_1f3a4)
    //),
    new Emoji(new int[] { 0x1f469, 0x200d, 0x1f3eb }, R.drawable.emoji_ios_1f469_200d_1f3eb
      //new Emoji(new int[] { 0x1f469, 0x1f3fb, 0x200d, 0x1f3eb }, R.drawable.emoji_ios_1f469_1f3fb_200d_1f3eb),
      //new Emoji(new int[] { 0x1f469, 0x1f3fc, 0x200d, 0x1f3eb }, R.drawable.emoji_ios_1f469_1f3fc_200d_1f3eb),
      //new Emoji(new int[] { 0x1f469, 0x1f3fd, 0x200d, 0x1f3eb }, R.drawable.emoji_ios_1f469_1f3fd_200d_1f3eb),
      //new Emoji(new int[] { 0x1f469, 0x1f3fe, 0x200d, 0x1f3eb }, R.drawable.emoji_ios_1f469_1f3fe_200d_1f3eb),
      //new Emoji(new int[] { 0x1f469, 0x1f3ff, 0x200d, 0x1f3eb }, R.drawable.emoji_ios_1f469_1f3ff_200d_1f3eb)
    ),
    new Emoji(new int[] { 0x1f468, 0x200d, 0x1f3eb }, R.drawable.emoji_ios_1f468_200d_1f3eb
      //new Emoji(new int[] { 0x1f468, 0x1f3fb, 0x200d, 0x1f3eb }, R.drawable.emoji_ios_1f468_1f3fb_200d_1f3eb),
      //new Emoji(new int[] { 0x1f468, 0x1f3fc, 0x200d, 0x1f3eb }, R.drawable.emoji_ios_1f468_1f3fc_200d_1f3eb),
      //new Emoji(new int[] { 0x1f468, 0x1f3fd, 0x200d, 0x1f3eb }, R.drawable.emoji_ios_1f468_1f3fd_200d_1f3eb),
      //new Emoji(new int[] { 0x1f468, 0x1f3fe, 0x200d, 0x1f3eb }, R.drawable.emoji_ios_1f468_1f3fe_200d_1f3eb),
      //new Emoji(new int[] { 0x1f468, 0x1f3ff, 0x200d, 0x1f3eb }, R.drawable.emoji_ios_1f468_1f3ff_200d_1f3eb)
    ),
    new Emoji(new int[] { 0x1f469, 0x200d, 0x1f3ed }, R.drawable.emoji_ios_1f469_200d_1f3ed
      //new Emoji(new int[] { 0x1f469, 0x1f3fb, 0x200d, 0x1f3ed }, R.drawable.emoji_ios_1f469_1f3fb_200d_1f3ed),
      //new Emoji(new int[] { 0x1f469, 0x1f3fc, 0x200d, 0x1f3ed }, R.drawable.emoji_ios_1f469_1f3fc_200d_1f3ed),
      //new Emoji(new int[] { 0x1f469, 0x1f3fd, 0x200d, 0x1f3ed }, R.drawable.emoji_ios_1f469_1f3fd_200d_1f3ed),
      //new Emoji(new int[] { 0x1f469, 0x1f3fe, 0x200d, 0x1f3ed }, R.drawable.emoji_ios_1f469_1f3fe_200d_1f3ed),
      //new Emoji(new int[] { 0x1f469, 0x1f3ff, 0x200d, 0x1f3ed }, R.drawable.emoji_ios_1f469_1f3ff_200d_1f3ed)
    ),
    new Emoji(new int[] { 0x1f468, 0x200d, 0x1f3ed }, R.drawable.emoji_ios_1f468_200d_1f3ed
      //new Emoji(new int[] { 0x1f468, 0x1f3fb, 0x200d, 0x1f3ed }, R.drawable.emoji_ios_1f468_1f3fb_200d_1f3ed),
      //new Emoji(new int[] { 0x1f468, 0x1f3fc, 0x200d, 0x1f3ed }, R.drawable.emoji_ios_1f468_1f3fc_200d_1f3ed),
      //new Emoji(new int[] { 0x1f468, 0x1f3fd, 0x200d, 0x1f3ed }, R.drawable.emoji_ios_1f468_1f3fd_200d_1f3ed),
      //new Emoji(new int[] { 0x1f468, 0x1f3fe, 0x200d, 0x1f3ed }, R.drawable.emoji_ios_1f468_1f3fe_200d_1f3ed),
      //new Emoji(new int[] { 0x1f468, 0x1f3ff, 0x200d, 0x1f3ed }, R.drawable.emoji_ios_1f468_1f3ff_200d_1f3ed)
    ),
    new Emoji(new int[] { 0x1f469, 0x200d, 0x1f4bb }, R.drawable.emoji_ios_1f469_200d_1f4bb
      //new Emoji(new int[] { 0x1f469, 0x1f3fb, 0x200d, 0x1f4bb }, R.drawable.emoji_ios_1f469_1f3fb_200d_1f4bb),
      //new Emoji(new int[] { 0x1f469, 0x1f3fc, 0x200d, 0x1f4bb }, R.drawable.emoji_ios_1f469_1f3fc_200d_1f4bb),
      //new Emoji(new int[] { 0x1f469, 0x1f3fd, 0x200d, 0x1f4bb }, R.drawable.emoji_ios_1f469_1f3fd_200d_1f4bb),
      //new Emoji(new int[] { 0x1f469, 0x1f3fe, 0x200d, 0x1f4bb }, R.drawable.emoji_ios_1f469_1f3fe_200d_1f4bb),
      //new Emoji(new int[] { 0x1f469, 0x1f3ff, 0x200d, 0x1f4bb }, R.drawable.emoji_ios_1f469_1f3ff_200d_1f4bb)
    ),
    new Emoji(new int[] { 0x1f468, 0x200d, 0x1f4bb }, R.drawable.emoji_ios_1f468_200d_1f4bb
      //new Emoji(new int[] { 0x1f468, 0x1f3fb, 0x200d, 0x1f4bb }, R.drawable.emoji_ios_1f468_1f3fb_200d_1f4bb),
      //new Emoji(new int[] { 0x1f468, 0x1f3fc, 0x200d, 0x1f4bb }, R.drawable.emoji_ios_1f468_1f3fc_200d_1f4bb),
      //new Emoji(new int[] { 0x1f468, 0x1f3fd, 0x200d, 0x1f4bb }, R.drawable.emoji_ios_1f468_1f3fd_200d_1f4bb),
      //new Emoji(new int[] { 0x1f468, 0x1f3fe, 0x200d, 0x1f4bb }, R.drawable.emoji_ios_1f468_1f3fe_200d_1f4bb),
      //new Emoji(new int[] { 0x1f468, 0x1f3ff, 0x200d, 0x1f4bb }, R.drawable.emoji_ios_1f468_1f3ff_200d_1f4bb)
    ),
    new Emoji(new int[] { 0x1f469, 0x200d, 0x1f4bc }, R.drawable.emoji_ios_1f469_200d_1f4bc
      //new Emoji(new int[] { 0x1f469, 0x1f3fb, 0x200d, 0x1f4bc }, R.drawable.emoji_ios_1f469_1f3fb_200d_1f4bc),
      //new Emoji(new int[] { 0x1f469, 0x1f3fc, 0x200d, 0x1f4bc }, R.drawable.emoji_ios_1f469_1f3fc_200d_1f4bc),
      //new Emoji(new int[] { 0x1f469, 0x1f3fd, 0x200d, 0x1f4bc }, R.drawable.emoji_ios_1f469_1f3fd_200d_1f4bc),
      //new Emoji(new int[] { 0x1f469, 0x1f3fe, 0x200d, 0x1f4bc }, R.drawable.emoji_ios_1f469_1f3fe_200d_1f4bc),
      //new Emoji(new int[] { 0x1f469, 0x1f3ff, 0x200d, 0x1f4bc }, R.drawable.emoji_ios_1f469_1f3ff_200d_1f4bc)
    ),
    new Emoji(new int[] { 0x1f468, 0x200d, 0x1f4bc }, R.drawable.emoji_ios_1f468_200d_1f4bc
      //new Emoji(new int[] { 0x1f468, 0x1f3fb, 0x200d, 0x1f4bc }, R.drawable.emoji_ios_1f468_1f3fb_200d_1f4bc),
      //new Emoji(new int[] { 0x1f468, 0x1f3fc, 0x200d, 0x1f4bc }, R.drawable.emoji_ios_1f468_1f3fc_200d_1f4bc),
      //new Emoji(new int[] { 0x1f468, 0x1f3fd, 0x200d, 0x1f4bc }, R.drawable.emoji_ios_1f468_1f3fd_200d_1f4bc),
      //new Emoji(new int[] { 0x1f468, 0x1f3fe, 0x200d, 0x1f4bc }, R.drawable.emoji_ios_1f468_1f3fe_200d_1f4bc),
      //new Emoji(new int[] { 0x1f468, 0x1f3ff, 0x200d, 0x1f4bc }, R.drawable.emoji_ios_1f468_1f3ff_200d_1f4bc)
    ),
    new Emoji(new int[] { 0x1f469, 0x200d, 0x1f527 }, R.drawable.emoji_ios_1f469_200d_1f527
      //new Emoji(new int[] { 0x1f469, 0x1f3fb, 0x200d, 0x1f527 }, R.drawable.emoji_ios_1f469_1f3fb_200d_1f527),
      //new Emoji(new int[] { 0x1f469, 0x1f3fc, 0x200d, 0x1f527 }, R.drawable.emoji_ios_1f469_1f3fc_200d_1f527),
      //new Emoji(new int[] { 0x1f469, 0x1f3fd, 0x200d, 0x1f527 }, R.drawable.emoji_ios_1f469_1f3fd_200d_1f527),
      //new Emoji(new int[] { 0x1f469, 0x1f3fe, 0x200d, 0x1f527 }, R.drawable.emoji_ios_1f469_1f3fe_200d_1f527),
      //new Emoji(new int[] { 0x1f469, 0x1f3ff, 0x200d, 0x1f527 }, R.drawable.emoji_ios_1f469_1f3ff_200d_1f527)
    ),
    new Emoji(new int[] { 0x1f468, 0x200d, 0x1f527 }, R.drawable.emoji_ios_1f468_200d_1f527
      //new Emoji(new int[] { 0x1f468, 0x1f3fb, 0x200d, 0x1f527 }, R.drawable.emoji_ios_1f468_1f3fb_200d_1f527),
      //new Emoji(new int[] { 0x1f468, 0x1f3fc, 0x200d, 0x1f527 }, R.drawable.emoji_ios_1f468_1f3fc_200d_1f527),
      //new Emoji(new int[] { 0x1f468, 0x1f3fd, 0x200d, 0x1f527 }, R.drawable.emoji_ios_1f468_1f3fd_200d_1f527),
      //new Emoji(new int[] { 0x1f468, 0x1f3fe, 0x200d, 0x1f527 }, R.drawable.emoji_ios_1f468_1f3fe_200d_1f527),
      //new Emoji(new int[] { 0x1f468, 0x1f3ff, 0x200d, 0x1f527 }, R.drawable.emoji_ios_1f468_1f3ff_200d_1f527)
    ),
    new Emoji(new int[] { 0x1f469, 0x200d, 0x1f52c }, R.drawable.emoji_ios_1f469_200d_1f52c
      //new Emoji(new int[] { 0x1f469, 0x1f3fb, 0x200d, 0x1f52c }, R.drawable.emoji_ios_1f469_1f3fb_200d_1f52c),
      //new Emoji(new int[] { 0x1f469, 0x1f3fc, 0x200d, 0x1f52c }, R.drawable.emoji_ios_1f469_1f3fc_200d_1f52c),
      //new Emoji(new int[] { 0x1f469, 0x1f3fd, 0x200d, 0x1f52c }, R.drawable.emoji_ios_1f469_1f3fd_200d_1f52c),
      //new Emoji(new int[] { 0x1f469, 0x1f3fe, 0x200d, 0x1f52c }, R.drawable.emoji_ios_1f469_1f3fe_200d_1f52c),
      //new Emoji(new int[] { 0x1f469, 0x1f3ff, 0x200d, 0x1f52c }, R.drawable.emoji_ios_1f469_1f3ff_200d_1f52c)
    ),
    new Emoji(new int[] { 0x1f468, 0x200d, 0x1f52c }, R.drawable.emoji_ios_1f468_200d_1f52c
      //new Emoji(new int[] { 0x1f468, 0x1f3fb, 0x200d, 0x1f52c }, R.drawable.emoji_ios_1f468_1f3fb_200d_1f52c),
      //new Emoji(new int[] { 0x1f468, 0x1f3fc, 0x200d, 0x1f52c }, R.drawable.emoji_ios_1f468_1f3fc_200d_1f52c),
      //new Emoji(new int[] { 0x1f468, 0x1f3fd, 0x200d, 0x1f52c }, R.drawable.emoji_ios_1f468_1f3fd_200d_1f52c),
      //new Emoji(new int[] { 0x1f468, 0x1f3fe, 0x200d, 0x1f52c }, R.drawable.emoji_ios_1f468_1f3fe_200d_1f52c),
      //new Emoji(new int[] { 0x1f468, 0x1f3ff, 0x200d, 0x1f52c }, R.drawable.emoji_ios_1f468_1f3ff_200d_1f52c)
    ),
    new Emoji(new int[] { 0x1f469, 0x200d, 0x1f3a8 }, R.drawable.emoji_ios_1f469_200d_1f3a8
      //new Emoji(new int[] { 0x1f469, 0x1f3fb, 0x200d, 0x1f3a8 }, R.drawable.emoji_ios_1f469_1f3fb_200d_1f3a8),
      //new Emoji(new int[] { 0x1f469, 0x1f3fc, 0x200d, 0x1f3a8 }, R.drawable.emoji_ios_1f469_1f3fc_200d_1f3a8),
      //new Emoji(new int[] { 0x1f469, 0x1f3fd, 0x200d, 0x1f3a8 }, R.drawable.emoji_ios_1f469_1f3fd_200d_1f3a8),
      //new Emoji(new int[] { 0x1f469, 0x1f3fe, 0x200d, 0x1f3a8 }, R.drawable.emoji_ios_1f469_1f3fe_200d_1f3a8),
      //new Emoji(new int[] { 0x1f469, 0x1f3ff, 0x200d, 0x1f3a8 }, R.drawable.emoji_ios_1f469_1f3ff_200d_1f3a8)
    ),
    new Emoji(new int[] { 0x1f468, 0x200d, 0x1f3a8 }, R.drawable.emoji_ios_1f468_200d_1f3a8
      //new Emoji(new int[] { 0x1f468, 0x1f3fb, 0x200d, 0x1f3a8 }, R.drawable.emoji_ios_1f468_1f3fb_200d_1f3a8),
      //new Emoji(new int[] { 0x1f468, 0x1f3fc, 0x200d, 0x1f3a8 }, R.drawable.emoji_ios_1f468_1f3fc_200d_1f3a8),
      //new Emoji(new int[] { 0x1f468, 0x1f3fd, 0x200d, 0x1f3a8 }, R.drawable.emoji_ios_1f468_1f3fd_200d_1f3a8),
      //new Emoji(new int[] { 0x1f468, 0x1f3fe, 0x200d, 0x1f3a8 }, R.drawable.emoji_ios_1f468_1f3fe_200d_1f3a8),
      //new Emoji(new int[] { 0x1f468, 0x1f3ff, 0x200d, 0x1f3a8 }, R.drawable.emoji_ios_1f468_1f3ff_200d_1f3a8)
    ),
    new Emoji(new int[] { 0x1f469, 0x200d, 0x1f692 }, R.drawable.emoji_ios_1f469_200d_1f692
      //new Emoji(new int[] { 0x1f469, 0x1f3fb, 0x200d, 0x1f692 }, R.drawable.emoji_ios_1f469_1f3fb_200d_1f692),
      //new Emoji(new int[] { 0x1f469, 0x1f3fc, 0x200d, 0x1f692 }, R.drawable.emoji_ios_1f469_1f3fc_200d_1f692),
      //new Emoji(new int[] { 0x1f469, 0x1f3fd, 0x200d, 0x1f692 }, R.drawable.emoji_ios_1f469_1f3fd_200d_1f692),
      //new Emoji(new int[] { 0x1f469, 0x1f3fe, 0x200d, 0x1f692 }, R.drawable.emoji_ios_1f469_1f3fe_200d_1f692),
      //new Emoji(new int[] { 0x1f469, 0x1f3ff, 0x200d, 0x1f692 }, R.drawable.emoji_ios_1f469_1f3ff_200d_1f692)
    ),
    new Emoji(new int[] { 0x1f468, 0x200d, 0x1f692 }, R.drawable.emoji_ios_1f468_200d_1f692
      //new Emoji(new int[] { 0x1f468, 0x1f3fb, 0x200d, 0x1f692 }, R.drawable.emoji_ios_1f468_1f3fb_200d_1f692),
      //new Emoji(new int[] { 0x1f468, 0x1f3fc, 0x200d, 0x1f692 }, R.drawable.emoji_ios_1f468_1f3fc_200d_1f692),
      //new Emoji(new int[] { 0x1f468, 0x1f3fd, 0x200d, 0x1f692 }, R.drawable.emoji_ios_1f468_1f3fd_200d_1f692),
      //new Emoji(new int[] { 0x1f468, 0x1f3fe, 0x200d, 0x1f692 }, R.drawable.emoji_ios_1f468_1f3fe_200d_1f692),
      //new Emoji(new int[] { 0x1f468, 0x1f3ff, 0x200d, 0x1f692 }, R.drawable.emoji_ios_1f468_1f3ff_200d_1f692)
    ),
    new Emoji(new int[] { 0x1f469, 0x200d, 0x2708, 0xfe0f }, R.drawable.emoji_ios_1f469_200d_2708_fe0f
      //new Emoji(new int[] { 0x1f469, 0x1f3fb, 0x200d, 0x2708, 0xfe0f }, R.drawable.emoji_ios_1f469_1f3fb_200d_2708_fe0f),
      //new Emoji(new int[] { 0x1f469, 0x1f3fc, 0x200d, 0x2708, 0xfe0f }, R.drawable.emoji_ios_1f469_1f3fc_200d_2708_fe0f),
      //new Emoji(new int[] { 0x1f469, 0x1f3fd, 0x200d, 0x2708, 0xfe0f }, R.drawable.emoji_ios_1f469_1f3fd_200d_2708_fe0f),
      //new Emoji(new int[] { 0x1f469, 0x1f3fe, 0x200d, 0x2708, 0xfe0f }, R.drawable.emoji_ios_1f469_1f3fe_200d_2708_fe0f),
      //new Emoji(new int[] { 0x1f469, 0x1f3ff, 0x200d, 0x2708, 0xfe0f }, R.drawable.emoji_ios_1f469_1f3ff_200d_2708_fe0f)
    ),
    new Emoji(new int[] { 0x1f468, 0x200d, 0x2708, 0xfe0f }, R.drawable.emoji_ios_1f468_200d_2708_fe0f
      //new Emoji(new int[] { 0x1f468, 0x1f3fb, 0x200d, 0x2708, 0xfe0f }, R.drawable.emoji_ios_1f468_1f3fb_200d_2708_fe0f),
      //new Emoji(new int[] { 0x1f468, 0x1f3fc, 0x200d, 0x2708, 0xfe0f }, R.drawable.emoji_ios_1f468_1f3fc_200d_2708_fe0f),
      //new Emoji(new int[] { 0x1f468, 0x1f3fd, 0x200d, 0x2708, 0xfe0f }, R.drawable.emoji_ios_1f468_1f3fd_200d_2708_fe0f),
      //new Emoji(new int[] { 0x1f468, 0x1f3fe, 0x200d, 0x2708, 0xfe0f }, R.drawable.emoji_ios_1f468_1f3fe_200d_2708_fe0f),
      //new Emoji(new int[] { 0x1f468, 0x1f3ff, 0x200d, 0x2708, 0xfe0f }, R.drawable.emoji_ios_1f468_1f3ff_200d_2708_fe0f)
    ),
    new Emoji(new int[] { 0x1f469, 0x200d, 0x1f680 }, R.drawable.emoji_ios_1f469_200d_1f680
      //new Emoji(new int[] { 0x1f469, 0x1f3fb, 0x200d, 0x1f680 }, R.drawable.emoji_ios_1f469_1f3fb_200d_1f680),
      //new Emoji(new int[] { 0x1f469, 0x1f3fc, 0x200d, 0x1f680 }, R.drawable.emoji_ios_1f469_1f3fc_200d_1f680),
      //new Emoji(new int[] { 0x1f469, 0x1f3fd, 0x200d, 0x1f680 }, R.drawable.emoji_ios_1f469_1f3fd_200d_1f680),
      //new Emoji(new int[] { 0x1f469, 0x1f3fe, 0x200d, 0x1f680 }, R.drawable.emoji_ios_1f469_1f3fe_200d_1f680),
      //new Emoji(new int[] { 0x1f469, 0x1f3ff, 0x200d, 0x1f680 }, R.drawable.emoji_ios_1f469_1f3ff_200d_1f680)
    ),
    new Emoji(new int[] { 0x1f468, 0x200d, 0x1f680 }, R.drawable.emoji_ios_1f468_200d_1f680
      //new Emoji(new int[] { 0x1f468, 0x1f3fb, 0x200d, 0x1f680 }, R.drawable.emoji_ios_1f468_1f3fb_200d_1f680),
      //new Emoji(new int[] { 0x1f468, 0x1f3fc, 0x200d, 0x1f680 }, R.drawable.emoji_ios_1f468_1f3fc_200d_1f680),
      //new Emoji(new int[] { 0x1f468, 0x1f3fd, 0x200d, 0x1f680 }, R.drawable.emoji_ios_1f468_1f3fd_200d_1f680),
      //new Emoji(new int[] { 0x1f468, 0x1f3fe, 0x200d, 0x1f680 }, R.drawable.emoji_ios_1f468_1f3fe_200d_1f680),
      //new Emoji(new int[] { 0x1f468, 0x1f3ff, 0x200d, 0x1f680 }, R.drawable.emoji_ios_1f468_1f3ff_200d_1f680)
    ),
    new Emoji(new int[] { 0x1f469, 0x200d, 0x2696, 0xfe0f }, R.drawable.emoji_ios_1f469_200d_2696_fe0f
      //new Emoji(new int[] { 0x1f469, 0x1f3fb, 0x200d, 0x2696, 0xfe0f }, R.drawable.emoji_ios_1f469_1f3fb_200d_2696_fe0f),
      //new Emoji(new int[] { 0x1f469, 0x1f3fc, 0x200d, 0x2696, 0xfe0f }, R.drawable.emoji_ios_1f469_1f3fc_200d_2696_fe0f),
      //new Emoji(new int[] { 0x1f469, 0x1f3fd, 0x200d, 0x2696, 0xfe0f }, R.drawable.emoji_ios_1f469_1f3fd_200d_2696_fe0f),
      //new Emoji(new int[] { 0x1f469, 0x1f3fe, 0x200d, 0x2696, 0xfe0f }, R.drawable.emoji_ios_1f469_1f3fe_200d_2696_fe0f),
      //new Emoji(new int[] { 0x1f469, 0x1f3ff, 0x200d, 0x2696, 0xfe0f }, R.drawable.emoji_ios_1f469_1f3ff_200d_2696_fe0f)
    ),
    new Emoji(new int[] { 0x1f468, 0x200d, 0x2696, 0xfe0f }, R.drawable.emoji_ios_1f468_200d_2696_fe0f
      //new Emoji(new int[] { 0x1f468, 0x1f3fb, 0x200d, 0x2696, 0xfe0f }, R.drawable.emoji_ios_1f468_1f3fb_200d_2696_fe0f),
      //new Emoji(new int[] { 0x1f468, 0x1f3fc, 0x200d, 0x2696, 0xfe0f }, R.drawable.emoji_ios_1f468_1f3fc_200d_2696_fe0f),
      //new Emoji(new int[] { 0x1f468, 0x1f3fd, 0x200d, 0x2696, 0xfe0f }, R.drawable.emoji_ios_1f468_1f3fd_200d_2696_fe0f),
      //new Emoji(new int[] { 0x1f468, 0x1f3fe, 0x200d, 0x2696, 0xfe0f }, R.drawable.emoji_ios_1f468_1f3fe_200d_2696_fe0f),
      //new Emoji(new int[] { 0x1f468, 0x1f3ff, 0x200d, 0x2696, 0xfe0f }, R.drawable.emoji_ios_1f468_1f3ff_200d_2696_fe0f)
    ),
    new Emoji(0x1f936, R.drawable.emoji_ios_1f936
      //new Emoji(new int[] { 0x1f936, 0x1f3fb }, R.drawable.emoji_ios_1f936_1f3fb),
      //new Emoji(new int[] { 0x1f936, 0x1f3fc }, R.drawable.emoji_ios_1f936_1f3fc),
      //new Emoji(new int[] { 0x1f936, 0x1f3fd }, R.drawable.emoji_ios_1f936_1f3fd),
      //new Emoji(new int[] { 0x1f936, 0x1f3fe }, R.drawable.emoji_ios_1f936_1f3fe),
      //new Emoji(new int[] { 0x1f936, 0x1f3ff }, R.drawable.emoji_ios_1f936_1f3ff)
    ),
    //new Emoji(0x1f385, R.drawable.emoji_ios_1f385,
    //  new Emoji(new int[] { 0x1f385, 0x1f3fb }, R.drawable.emoji_ios_1f385_1f3fb),
    //  new Emoji(new int[] { 0x1f385, 0x1f3fc }, R.drawable.emoji_ios_1f385_1f3fc),
    //  new Emoji(new int[] { 0x1f385, 0x1f3fd }, R.drawable.emoji_ios_1f385_1f3fd),
    //  new Emoji(new int[] { 0x1f385, 0x1f3fe }, R.drawable.emoji_ios_1f385_1f3fe),
    //  new Emoji(new int[] { 0x1f385, 0x1f3ff }, R.drawable.emoji_ios_1f385_1f3ff)
    //),
    new Emoji(0x1f478, R.drawable.emoji_ios_1f478
      //new Emoji(new int[] { 0x1f478, 0x1f3fb }, R.drawable.emoji_ios_1f478_1f3fb),
      //new Emoji(new int[] { 0x1f478, 0x1f3fc }, R.drawable.emoji_ios_1f478_1f3fc),
      //new Emoji(new int[] { 0x1f478, 0x1f3fd }, R.drawable.emoji_ios_1f478_1f3fd),
      //new Emoji(new int[] { 0x1f478, 0x1f3fe }, R.drawable.emoji_ios_1f478_1f3fe),
      //new Emoji(new int[] { 0x1f478, 0x1f3ff }, R.drawable.emoji_ios_1f478_1f3ff)
    ),
    new Emoji(0x1f934, R.drawable.emoji_ios_1f934
      //new Emoji(new int[] { 0x1f934, 0x1f3fb }, R.drawable.emoji_ios_1f934_1f3fb),
      //new Emoji(new int[] { 0x1f934, 0x1f3fc }, R.drawable.emoji_ios_1f934_1f3fc),
      //new Emoji(new int[] { 0x1f934, 0x1f3fd }, R.drawable.emoji_ios_1f934_1f3fd),
      //new Emoji(new int[] { 0x1f934, 0x1f3fe }, R.drawable.emoji_ios_1f934_1f3fe),
      //new Emoji(new int[] { 0x1f934, 0x1f3ff }, R.drawable.emoji_ios_1f934_1f3ff)
    ),
    new Emoji(0x1f470, R.drawable.emoji_ios_1f470
      //new Emoji(new int[] { 0x1f470, 0x1f3fb }, R.drawable.emoji_ios_1f470_1f3fb),
      //new Emoji(new int[] { 0x1f470, 0x1f3fc }, R.drawable.emoji_ios_1f470_1f3fc),
      //new Emoji(new int[] { 0x1f470, 0x1f3fd }, R.drawable.emoji_ios_1f470_1f3fd),
      //new Emoji(new int[] { 0x1f470, 0x1f3fe }, R.drawable.emoji_ios_1f470_1f3fe),
      //new Emoji(new int[] { 0x1f470, 0x1f3ff }, R.drawable.emoji_ios_1f470_1f3ff)
    ),
    new Emoji(0x1f935, R.drawable.emoji_ios_1f935
      //new Emoji(new int[] { 0x1f935, 0x1f3fb }, R.drawable.emoji_ios_1f935_1f3fb),
      //new Emoji(new int[] { 0x1f935, 0x1f3fc }, R.drawable.emoji_ios_1f935_1f3fc),
      //new Emoji(new int[] { 0x1f935, 0x1f3fd }, R.drawable.emoji_ios_1f935_1f3fd),
      //new Emoji(new int[] { 0x1f935, 0x1f3fe }, R.drawable.emoji_ios_1f935_1f3fe),
      //new Emoji(new int[] { 0x1f935, 0x1f3ff }, R.drawable.emoji_ios_1f935_1f3ff)
    ),
    new Emoji(0x1f47c, R.drawable.emoji_ios_1f47c
      //new Emoji(new int[] { 0x1f47c, 0x1f3fb }, R.drawable.emoji_ios_1f47c_1f3fb),
      //new Emoji(new int[] { 0x1f47c, 0x1f3fc }, R.drawable.emoji_ios_1f47c_1f3fc),
      //new Emoji(new int[] { 0x1f47c, 0x1f3fd }, R.drawable.emoji_ios_1f47c_1f3fd),
      //new Emoji(new int[] { 0x1f47c, 0x1f3fe }, R.drawable.emoji_ios_1f47c_1f3fe),
      //new Emoji(new int[] { 0x1f47c, 0x1f3ff }, R.drawable.emoji_ios_1f47c_1f3ff)
    ),
    new Emoji(0x1f930, R.drawable.emoji_ios_1f930
      //new Emoji(new int[] { 0x1f930, 0x1f3fb }, R.drawable.emoji_ios_1f930_1f3fb),
      //new Emoji(new int[] { 0x1f930, 0x1f3fc }, R.drawable.emoji_ios_1f930_1f3fc),
      //new Emoji(new int[] { 0x1f930, 0x1f3fd }, R.drawable.emoji_ios_1f930_1f3fd),
      //new Emoji(new int[] { 0x1f930, 0x1f3fe }, R.drawable.emoji_ios_1f930_1f3fe),
      //new Emoji(new int[] { 0x1f930, 0x1f3ff }, R.drawable.emoji_ios_1f930_1f3ff)
    ),
    new Emoji(new int[] { 0x1f647, 0x200d, 0x2640, 0xfe0f }, R.drawable.emoji_ios_1f647_200d_2640_fe0f
      //new Emoji(new int[] { 0x1f647, 0x1f3fb, 0x200d, 0x2640, 0xfe0f }, R.drawable.emoji_ios_1f647_1f3fb_200d_2640_fe0f),
      //new Emoji(new int[] { 0x1f647, 0x1f3fc, 0x200d, 0x2640, 0xfe0f }, R.drawable.emoji_ios_1f647_1f3fc_200d_2640_fe0f),
      //new Emoji(new int[] { 0x1f647, 0x1f3fd, 0x200d, 0x2640, 0xfe0f }, R.drawable.emoji_ios_1f647_1f3fd_200d_2640_fe0f),
      //new Emoji(new int[] { 0x1f647, 0x1f3fe, 0x200d, 0x2640, 0xfe0f }, R.drawable.emoji_ios_1f647_1f3fe_200d_2640_fe0f),
      //new Emoji(new int[] { 0x1f647, 0x1f3ff, 0x200d, 0x2640, 0xfe0f }, R.drawable.emoji_ios_1f647_1f3ff_200d_2640_fe0f)
    ),
    new Emoji(0x1f647, R.drawable.emoji_ios_1f647
      //new Emoji(new int[] { 0x1f647, 0x1f3fb }, R.drawable.emoji_ios_1f647_1f3fb),
      //new Emoji(new int[] { 0x1f647, 0x1f3fc }, R.drawable.emoji_ios_1f647_1f3fc),
      //new Emoji(new int[] { 0x1f647, 0x1f3fd }, R.drawable.emoji_ios_1f647_1f3fd),
      //new Emoji(new int[] { 0x1f647, 0x1f3fe }, R.drawable.emoji_ios_1f647_1f3fe),
      //new Emoji(new int[] { 0x1f647, 0x1f3ff }, R.drawable.emoji_ios_1f647_1f3ff)
    ),
    new Emoji(0x1f481, R.drawable.emoji_ios_1f481
      //new Emoji(new int[] { 0x1f481, 0x1f3fb }, R.drawable.emoji_ios_1f481_1f3fb),
      //new Emoji(new int[] { 0x1f481, 0x1f3fc }, R.drawable.emoji_ios_1f481_1f3fc),
      //new Emoji(new int[] { 0x1f481, 0x1f3fd }, R.drawable.emoji_ios_1f481_1f3fd),
      //new Emoji(new int[] { 0x1f481, 0x1f3fe }, R.drawable.emoji_ios_1f481_1f3fe),
      //new Emoji(new int[] { 0x1f481, 0x1f3ff }, R.drawable.emoji_ios_1f481_1f3ff)
    ),
    new Emoji(new int[] { 0x1f481, 0x200d, 0x2642, 0xfe0f }, R.drawable.emoji_ios_1f481_200d_2642_fe0f
      //new Emoji(new int[] { 0x1f481, 0x1f3fb, 0x200d, 0x2642, 0xfe0f }, R.drawable.emoji_ios_1f481_1f3fb_200d_2642_fe0f),
      //new Emoji(new int[] { 0x1f481, 0x1f3fc, 0x200d, 0x2642, 0xfe0f }, R.drawable.emoji_ios_1f481_1f3fc_200d_2642_fe0f),
      //new Emoji(new int[] { 0x1f481, 0x1f3fd, 0x200d, 0x2642, 0xfe0f }, R.drawable.emoji_ios_1f481_1f3fd_200d_2642_fe0f),
      //new Emoji(new int[] { 0x1f481, 0x1f3fe, 0x200d, 0x2642, 0xfe0f }, R.drawable.emoji_ios_1f481_1f3fe_200d_2642_fe0f),
      //new Emoji(new int[] { 0x1f481, 0x1f3ff, 0x200d, 0x2642, 0xfe0f }, R.drawable.emoji_ios_1f481_1f3ff_200d_2642_fe0f)
    ),
    new Emoji(0x1f645, R.drawable.emoji_ios_1f645
      //new Emoji(new int[] { 0x1f645, 0x1f3fb }, R.drawable.emoji_ios_1f645_1f3fb),
      //new Emoji(new int[] { 0x1f645, 0x1f3fc }, R.drawable.emoji_ios_1f645_1f3fc),
      //new Emoji(new int[] { 0x1f645, 0x1f3fd }, R.drawable.emoji_ios_1f645_1f3fd),
      //new Emoji(new int[] { 0x1f645, 0x1f3fe }, R.drawable.emoji_ios_1f645_1f3fe),
      //new Emoji(new int[] { 0x1f645, 0x1f3ff }, R.drawable.emoji_ios_1f645_1f3ff)
    ),
    new Emoji(new int[] { 0x1f645, 0x200d, 0x2642, 0xfe0f }, R.drawable.emoji_ios_1f645_200d_2642_fe0f
      //new Emoji(new int[] { 0x1f645, 0x1f3fb, 0x200d, 0x2642, 0xfe0f }, R.drawable.emoji_ios_1f645_1f3fb_200d_2642_fe0f),
      //new Emoji(new int[] { 0x1f645, 0x1f3fc, 0x200d, 0x2642, 0xfe0f }, R.drawable.emoji_ios_1f645_1f3fc_200d_2642_fe0f),
      //new Emoji(new int[] { 0x1f645, 0x1f3fd, 0x200d, 0x2642, 0xfe0f }, R.drawable.emoji_ios_1f645_1f3fd_200d_2642_fe0f),
      //new Emoji(new int[] { 0x1f645, 0x1f3fe, 0x200d, 0x2642, 0xfe0f }, R.drawable.emoji_ios_1f645_1f3fe_200d_2642_fe0f),
      //new Emoji(new int[] { 0x1f645, 0x1f3ff, 0x200d, 0x2642, 0xfe0f }, R.drawable.emoji_ios_1f645_1f3ff_200d_2642_fe0f)
    ),
    new Emoji(0x1f646, R.drawable.emoji_ios_1f646
      //new Emoji(new int[] { 0x1f646, 0x1f3fb }, R.drawable.emoji_ios_1f646_1f3fb),
      //new Emoji(new int[] { 0x1f646, 0x1f3fc }, R.drawable.emoji_ios_1f646_1f3fc),
      //new Emoji(new int[] { 0x1f646, 0x1f3fd }, R.drawable.emoji_ios_1f646_1f3fd),
      //new Emoji(new int[] { 0x1f646, 0x1f3fe }, R.drawable.emoji_ios_1f646_1f3fe),
      //new Emoji(new int[] { 0x1f646, 0x1f3ff }, R.drawable.emoji_ios_1f646_1f3ff)
    ),
    new Emoji(new int[] { 0x1f646, 0x200d, 0x2642, 0xfe0f }, R.drawable.emoji_ios_1f646_200d_2642_fe0f
      //new Emoji(new int[] { 0x1f646, 0x1f3fb, 0x200d, 0x2642, 0xfe0f }, R.drawable.emoji_ios_1f646_1f3fb_200d_2642_fe0f),
      //new Emoji(new int[] { 0x1f646, 0x1f3fc, 0x200d, 0x2642, 0xfe0f }, R.drawable.emoji_ios_1f646_1f3fc_200d_2642_fe0f),
      //new Emoji(new int[] { 0x1f646, 0x1f3fd, 0x200d, 0x2642, 0xfe0f }, R.drawable.emoji_ios_1f646_1f3fd_200d_2642_fe0f),
      //new Emoji(new int[] { 0x1f646, 0x1f3fe, 0x200d, 0x2642, 0xfe0f }, R.drawable.emoji_ios_1f646_1f3fe_200d_2642_fe0f),
      //new Emoji(new int[] { 0x1f646, 0x1f3ff, 0x200d, 0x2642, 0xfe0f }, R.drawable.emoji_ios_1f646_1f3ff_200d_2642_fe0f)
    ),
    new Emoji(0x1f64b, R.drawable.emoji_ios_1f64b
      //new Emoji(new int[] { 0x1f64b, 0x1f3fb }, R.drawable.emoji_ios_1f64b_1f3fb),
      //new Emoji(new int[] { 0x1f64b, 0x1f3fc }, R.drawable.emoji_ios_1f64b_1f3fc),
      //new Emoji(new int[] { 0x1f64b, 0x1f3fd }, R.drawable.emoji_ios_1f64b_1f3fd),
      //new Emoji(new int[] { 0x1f64b, 0x1f3fe }, R.drawable.emoji_ios_1f64b_1f3fe),
      //new Emoji(new int[] { 0x1f64b, 0x1f3ff }, R.drawable.emoji_ios_1f64b_1f3ff)
    ),
    new Emoji(new int[] { 0x1f64b, 0x200d, 0x2642, 0xfe0f }, R.drawable.emoji_ios_1f64b_200d_2642_fe0f
      //new Emoji(new int[] { 0x1f64b, 0x1f3fb, 0x200d, 0x2642, 0xfe0f }, R.drawable.emoji_ios_1f64b_1f3fb_200d_2642_fe0f),
      //new Emoji(new int[] { 0x1f64b, 0x1f3fc, 0x200d, 0x2642, 0xfe0f }, R.drawable.emoji_ios_1f64b_1f3fc_200d_2642_fe0f),
      //new Emoji(new int[] { 0x1f64b, 0x1f3fd, 0x200d, 0x2642, 0xfe0f }, R.drawable.emoji_ios_1f64b_1f3fd_200d_2642_fe0f),
      //new Emoji(new int[] { 0x1f64b, 0x1f3fe, 0x200d, 0x2642, 0xfe0f }, R.drawable.emoji_ios_1f64b_1f3fe_200d_2642_fe0f),
      //new Emoji(new int[] { 0x1f64b, 0x1f3ff, 0x200d, 0x2642, 0xfe0f }, R.drawable.emoji_ios_1f64b_1f3ff_200d_2642_fe0f)
    ),
    new Emoji(new int[] { 0x1f926, 0x200d, 0x2640, 0xfe0f }, R.drawable.emoji_ios_1f926_200d_2640_fe0f
      //new Emoji(new int[] { 0x1f926, 0x1f3fb, 0x200d, 0x2640, 0xfe0f }, R.drawable.emoji_ios_1f926_1f3fb_200d_2640_fe0f),
      //new Emoji(new int[] { 0x1f926, 0x1f3fc, 0x200d, 0x2640, 0xfe0f }, R.drawable.emoji_ios_1f926_1f3fc_200d_2640_fe0f),
      //new Emoji(new int[] { 0x1f926, 0x1f3fd, 0x200d, 0x2640, 0xfe0f }, R.drawable.emoji_ios_1f926_1f3fd_200d_2640_fe0f),
      //new Emoji(new int[] { 0x1f926, 0x1f3fe, 0x200d, 0x2640, 0xfe0f }, R.drawable.emoji_ios_1f926_1f3fe_200d_2640_fe0f),
      //new Emoji(new int[] { 0x1f926, 0x1f3ff, 0x200d, 0x2640, 0xfe0f }, R.drawable.emoji_ios_1f926_1f3ff_200d_2640_fe0f)
    ),
    new Emoji(new int[] { 0x1f926, 0x200d, 0x2642, 0xfe0f }, R.drawable.emoji_ios_1f926_200d_2642_fe0f
      //new Emoji(new int[] { 0x1f926, 0x1f3fb, 0x200d, 0x2642, 0xfe0f }, R.drawable.emoji_ios_1f926_1f3fb_200d_2642_fe0f),
      //new Emoji(new int[] { 0x1f926, 0x1f3fc, 0x200d, 0x2642, 0xfe0f }, R.drawable.emoji_ios_1f926_1f3fc_200d_2642_fe0f),
      //new Emoji(new int[] { 0x1f926, 0x1f3fd, 0x200d, 0x2642, 0xfe0f }, R.drawable.emoji_ios_1f926_1f3fd_200d_2642_fe0f),
      //new Emoji(new int[] { 0x1f926, 0x1f3fe, 0x200d, 0x2642, 0xfe0f }, R.drawable.emoji_ios_1f926_1f3fe_200d_2642_fe0f),
      //new Emoji(new int[] { 0x1f926, 0x1f3ff, 0x200d, 0x2642, 0xfe0f }, R.drawable.emoji_ios_1f926_1f3ff_200d_2642_fe0f)
    ),
    new Emoji(new int[] { 0x1f937, 0x200d, 0x2640, 0xfe0f }, R.drawable.emoji_ios_1f937_200d_2640_fe0f
      //new Emoji(new int[] { 0x1f937, 0x1f3fb, 0x200d, 0x2640, 0xfe0f }, R.drawable.emoji_ios_1f937_1f3fb_200d_2640_fe0f),
      //new Emoji(new int[] { 0x1f937, 0x1f3fc, 0x200d, 0x2640, 0xfe0f }, R.drawable.emoji_ios_1f937_1f3fc_200d_2640_fe0f),
      //new Emoji(new int[] { 0x1f937, 0x1f3fd, 0x200d, 0x2640, 0xfe0f }, R.drawable.emoji_ios_1f937_1f3fd_200d_2640_fe0f),
      //new Emoji(new int[] { 0x1f937, 0x1f3fe, 0x200d, 0x2640, 0xfe0f }, R.drawable.emoji_ios_1f937_1f3fe_200d_2640_fe0f),
      //new Emoji(new int[] { 0x1f937, 0x1f3ff, 0x200d, 0x2640, 0xfe0f }, R.drawable.emoji_ios_1f937_1f3ff_200d_2640_fe0f)
    ),
    new Emoji(new int[] { 0x1f937, 0x200d, 0x2642, 0xfe0f }, R.drawable.emoji_ios_1f937_200d_2642_fe0f
      //new Emoji(new int[] { 0x1f937, 0x1f3fb, 0x200d, 0x2642, 0xfe0f }, R.drawable.emoji_ios_1f937_1f3fb_200d_2642_fe0f),
      //new Emoji(new int[] { 0x1f937, 0x1f3fc, 0x200d, 0x2642, 0xfe0f }, R.drawable.emoji_ios_1f937_1f3fc_200d_2642_fe0f),
      //new Emoji(new int[] { 0x1f937, 0x1f3fd, 0x200d, 0x2642, 0xfe0f }, R.drawable.emoji_ios_1f937_1f3fd_200d_2642_fe0f),
      //new Emoji(new int[] { 0x1f937, 0x1f3fe, 0x200d, 0x2642, 0xfe0f }, R.drawable.emoji_ios_1f937_1f3fe_200d_2642_fe0f),
      //new Emoji(new int[] { 0x1f937, 0x1f3ff, 0x200d, 0x2642, 0xfe0f }, R.drawable.emoji_ios_1f937_1f3ff_200d_2642_fe0f)
    ),
    new Emoji(0x1f64e, R.drawable.emoji_ios_1f64e
      //new Emoji(new int[] { 0x1f64e, 0x1f3fb }, R.drawable.emoji_ios_1f64e_1f3fb),
      //new Emoji(new int[] { 0x1f64e, 0x1f3fc }, R.drawable.emoji_ios_1f64e_1f3fc),
      //new Emoji(new int[] { 0x1f64e, 0x1f3fd }, R.drawable.emoji_ios_1f64e_1f3fd),
      //new Emoji(new int[] { 0x1f64e, 0x1f3fe }, R.drawable.emoji_ios_1f64e_1f3fe),
      //new Emoji(new int[] { 0x1f64e, 0x1f3ff }, R.drawable.emoji_ios_1f64e_1f3ff)
    ),
    new Emoji(new int[] { 0x1f64e, 0x200d, 0x2642, 0xfe0f }, R.drawable.emoji_ios_1f64e_200d_2642_fe0f
      //new Emoji(new int[] { 0x1f64e, 0x1f3fb, 0x200d, 0x2642, 0xfe0f }, R.drawable.emoji_ios_1f64e_1f3fb_200d_2642_fe0f),
      //new Emoji(new int[] { 0x1f64e, 0x1f3fc, 0x200d, 0x2642, 0xfe0f }, R.drawable.emoji_ios_1f64e_1f3fc_200d_2642_fe0f),
      //new Emoji(new int[] { 0x1f64e, 0x1f3fd, 0x200d, 0x2642, 0xfe0f }, R.drawable.emoji_ios_1f64e_1f3fd_200d_2642_fe0f),
      //new Emoji(new int[] { 0x1f64e, 0x1f3fe, 0x200d, 0x2642, 0xfe0f }, R.drawable.emoji_ios_1f64e_1f3fe_200d_2642_fe0f),
      //new Emoji(new int[] { 0x1f64e, 0x1f3ff, 0x200d, 0x2642, 0xfe0f }, R.drawable.emoji_ios_1f64e_1f3ff_200d_2642_fe0f)
    ),
    new Emoji(0x1f64d, R.drawable.emoji_ios_1f64d
      //new Emoji(new int[] { 0x1f64d, 0x1f3fb }, R.drawable.emoji_ios_1f64d_1f3fb),
      //new Emoji(new int[] { 0x1f64d, 0x1f3fc }, R.drawable.emoji_ios_1f64d_1f3fc),
      //new Emoji(new int[] { 0x1f64d, 0x1f3fd }, R.drawable.emoji_ios_1f64d_1f3fd),
      //new Emoji(new int[] { 0x1f64d, 0x1f3fe }, R.drawable.emoji_ios_1f64d_1f3fe),
      //new Emoji(new int[] { 0x1f64d, 0x1f3ff }, R.drawable.emoji_ios_1f64d_1f3ff)
    ),
    new Emoji(new int[] { 0x1f64d, 0x200d, 0x2642, 0xfe0f }, R.drawable.emoji_ios_1f64d_200d_2642_fe0f
      //new Emoji(new int[] { 0x1f64d, 0x1f3fb, 0x200d, 0x2642, 0xfe0f }, R.drawable.emoji_ios_1f64d_1f3fb_200d_2642_fe0f),
      //new Emoji(new int[] { 0x1f64d, 0x1f3fc, 0x200d, 0x2642, 0xfe0f }, R.drawable.emoji_ios_1f64d_1f3fc_200d_2642_fe0f),
      //new Emoji(new int[] { 0x1f64d, 0x1f3fd, 0x200d, 0x2642, 0xfe0f }, R.drawable.emoji_ios_1f64d_1f3fd_200d_2642_fe0f),
      //new Emoji(new int[] { 0x1f64d, 0x1f3fe, 0x200d, 0x2642, 0xfe0f }, R.drawable.emoji_ios_1f64d_1f3fe_200d_2642_fe0f),
      //new Emoji(new int[] { 0x1f64d, 0x1f3ff, 0x200d, 0x2642, 0xfe0f }, R.drawable.emoji_ios_1f64d_1f3ff_200d_2642_fe0f)
    ),
    new Emoji(0x1f487, R.drawable.emoji_ios_1f487
      //new Emoji(new int[] { 0x1f487, 0x1f3fb }, R.drawable.emoji_ios_1f487_1f3fb),
      //new Emoji(new int[] { 0x1f487, 0x1f3fc }, R.drawable.emoji_ios_1f487_1f3fc),
      //new Emoji(new int[] { 0x1f487, 0x1f3fd }, R.drawable.emoji_ios_1f487_1f3fd),
      //new Emoji(new int[] { 0x1f487, 0x1f3fe }, R.drawable.emoji_ios_1f487_1f3fe),
      //new Emoji(new int[] { 0x1f487, 0x1f3ff }, R.drawable.emoji_ios_1f487_1f3ff)
    ),
    new Emoji(new int[] { 0x1f487, 0x200d, 0x2642, 0xfe0f }, R.drawable.emoji_ios_1f487_200d_2642_fe0f
      //new Emoji(new int[] { 0x1f487, 0x1f3fb, 0x200d, 0x2642, 0xfe0f }, R.drawable.emoji_ios_1f487_1f3fb_200d_2642_fe0f),
      //new Emoji(new int[] { 0x1f487, 0x1f3fc, 0x200d, 0x2642, 0xfe0f }, R.drawable.emoji_ios_1f487_1f3fc_200d_2642_fe0f),
      //new Emoji(new int[] { 0x1f487, 0x1f3fd, 0x200d, 0x2642, 0xfe0f }, R.drawable.emoji_ios_1f487_1f3fd_200d_2642_fe0f),
      //new Emoji(new int[] { 0x1f487, 0x1f3fe, 0x200d, 0x2642, 0xfe0f }, R.drawable.emoji_ios_1f487_1f3fe_200d_2642_fe0f),
      //new Emoji(new int[] { 0x1f487, 0x1f3ff, 0x200d, 0x2642, 0xfe0f }, R.drawable.emoji_ios_1f487_1f3ff_200d_2642_fe0f)
    ),
    new Emoji(0x1f486, R.drawable.emoji_ios_1f486
      //new Emoji(new int[] { 0x1f486, 0x1f3fb }, R.drawable.emoji_ios_1f486_1f3fb),
      //new Emoji(new int[] { 0x1f486, 0x1f3fc }, R.drawable.emoji_ios_1f486_1f3fc),
      //new Emoji(new int[] { 0x1f486, 0x1f3fd }, R.drawable.emoji_ios_1f486_1f3fd),
      //new Emoji(new int[] { 0x1f486, 0x1f3fe }, R.drawable.emoji_ios_1f486_1f3fe),
      //new Emoji(new int[] { 0x1f486, 0x1f3ff }, R.drawable.emoji_ios_1f486_1f3ff)
    ),
    new Emoji(new int[] { 0x1f486, 0x200d, 0x2642, 0xfe0f }, R.drawable.emoji_ios_1f486_200d_2642_fe0f
      //new Emoji(new int[] { 0x1f486, 0x1f3fb, 0x200d, 0x2642, 0xfe0f }, R.drawable.emoji_ios_1f486_1f3fb_200d_2642_fe0f),
      //new Emoji(new int[] { 0x1f486, 0x1f3fc, 0x200d, 0x2642, 0xfe0f }, R.drawable.emoji_ios_1f486_1f3fc_200d_2642_fe0f),
      //new Emoji(new int[] { 0x1f486, 0x1f3fd, 0x200d, 0x2642, 0xfe0f }, R.drawable.emoji_ios_1f486_1f3fd_200d_2642_fe0f),
      //new Emoji(new int[] { 0x1f486, 0x1f3fe, 0x200d, 0x2642, 0xfe0f }, R.drawable.emoji_ios_1f486_1f3fe_200d_2642_fe0f),
      //new Emoji(new int[] { 0x1f486, 0x1f3ff, 0x200d, 0x2642, 0xfe0f }, R.drawable.emoji_ios_1f486_1f3ff_200d_2642_fe0f)
    ),
    //new Emoji(0x1f574, R.drawable.emoji_ios_1f574,
    //  new Emoji(new int[] { 0x1f574, 0x1f3fb }, R.drawable.emoji_ios_1f574_1f3fb),
    //  new Emoji(new int[] { 0x1f574, 0x1f3fc }, R.drawable.emoji_ios_1f574_1f3fc),
    //  new Emoji(new int[] { 0x1f574, 0x1f3fd }, R.drawable.emoji_ios_1f574_1f3fd),
    //  new Emoji(new int[] { 0x1f574, 0x1f3fe }, R.drawable.emoji_ios_1f574_1f3fe),
    //  new Emoji(new int[] { 0x1f574, 0x1f3ff }, R.drawable.emoji_ios_1f574_1f3ff)
    //),
    //new Emoji(0x1f483, R.drawable.emoji_ios_1f483,
    //  new Emoji(new int[] { 0x1f483, 0x1f3fb }, R.drawable.emoji_ios_1f483_1f3fb),
    //  new Emoji(new int[] { 0x1f483, 0x1f3fc }, R.drawable.emoji_ios_1f483_1f3fc),
    //  new Emoji(new int[] { 0x1f483, 0x1f3fd }, R.drawable.emoji_ios_1f483_1f3fd),
    //  new Emoji(new int[] { 0x1f483, 0x1f3fe }, R.drawable.emoji_ios_1f483_1f3fe),
    //  new Emoji(new int[] { 0x1f483, 0x1f3ff }, R.drawable.emoji_ios_1f483_1f3ff)
    //),
    //new Emoji(0x1f57a, R.drawable.emoji_ios_1f57a,
    //  new Emoji(new int[] { 0x1f57a, 0x1f3fb }, R.drawable.emoji_ios_1f57a_1f3fb),
    //  new Emoji(new int[] { 0x1f57a, 0x1f3fc }, R.drawable.emoji_ios_1f57a_1f3fc),
    //  new Emoji(new int[] { 0x1f57a, 0x1f3fd }, R.drawable.emoji_ios_1f57a_1f3fd),
    //  new Emoji(new int[] { 0x1f57a, 0x1f3fe }, R.drawable.emoji_ios_1f57a_1f3fe),
    //  new Emoji(new int[] { 0x1f57a, 0x1f3ff }, R.drawable.emoji_ios_1f57a_1f3ff)
    //),
    //new Emoji(0x1f46f, R.drawable.emoji_ios_1f46f),
    //new Emoji(new int[] { 0x1f46f, 0x200d, 0x2642, 0xfe0f }, R.drawable.emoji_ios_1f46f_200d_2642_fe0f),
    //new Emoji(new int[] { 0x1f6b6, 0x200d, 0x2640, 0xfe0f }, R.drawable.emoji_ios_1f6b6_200d_2640_fe0f,
    //  new Emoji(new int[] { 0x1f6b6, 0x1f3fb, 0x200d, 0x2640, 0xfe0f }, R.drawable.emoji_ios_1f6b6_1f3fb_200d_2640_fe0f),
    //  new Emoji(new int[] { 0x1f6b6, 0x1f3fc, 0x200d, 0x2640, 0xfe0f }, R.drawable.emoji_ios_1f6b6_1f3fc_200d_2640_fe0f),
    //  new Emoji(new int[] { 0x1f6b6, 0x1f3fd, 0x200d, 0x2640, 0xfe0f }, R.drawable.emoji_ios_1f6b6_1f3fd_200d_2640_fe0f),
    //  new Emoji(new int[] { 0x1f6b6, 0x1f3fe, 0x200d, 0x2640, 0xfe0f }, R.drawable.emoji_ios_1f6b6_1f3fe_200d_2640_fe0f),
    //  new Emoji(new int[] { 0x1f6b6, 0x1f3ff, 0x200d, 0x2640, 0xfe0f }, R.drawable.emoji_ios_1f6b6_1f3ff_200d_2640_fe0f)
    //),
    //new Emoji(0x1f6b6, R.drawable.emoji_ios_1f6b6,
    //  new Emoji(new int[] { 0x1f6b6, 0x1f3fb }, R.drawable.emoji_ios_1f6b6_1f3fb),
    //  new Emoji(new int[] { 0x1f6b6, 0x1f3fc }, R.drawable.emoji_ios_1f6b6_1f3fc),
    //  new Emoji(new int[] { 0x1f6b6, 0x1f3fd }, R.drawable.emoji_ios_1f6b6_1f3fd),
    //  new Emoji(new int[] { 0x1f6b6, 0x1f3fe }, R.drawable.emoji_ios_1f6b6_1f3fe),
    //  new Emoji(new int[] { 0x1f6b6, 0x1f3ff }, R.drawable.emoji_ios_1f6b6_1f3ff)
    //),
    //new Emoji(new int[] { 0x1f3c3, 0x200d, 0x2640, 0xfe0f }, R.drawable.emoji_ios_1f3c3_200d_2640_fe0f,
    //  new Emoji(new int[] { 0x1f3c3, 0x1f3fb, 0x200d, 0x2640, 0xfe0f }, R.drawable.emoji_ios_1f3c3_1f3fb_200d_2640_fe0f),
    //  new Emoji(new int[] { 0x1f3c3, 0x1f3fc, 0x200d, 0x2640, 0xfe0f }, R.drawable.emoji_ios_1f3c3_1f3fc_200d_2640_fe0f),
    //  new Emoji(new int[] { 0x1f3c3, 0x1f3fd, 0x200d, 0x2640, 0xfe0f }, R.drawable.emoji_ios_1f3c3_1f3fd_200d_2640_fe0f),
    //  new Emoji(new int[] { 0x1f3c3, 0x1f3fe, 0x200d, 0x2640, 0xfe0f }, R.drawable.emoji_ios_1f3c3_1f3fe_200d_2640_fe0f),
    //  new Emoji(new int[] { 0x1f3c3, 0x1f3ff, 0x200d, 0x2640, 0xfe0f }, R.drawable.emoji_ios_1f3c3_1f3ff_200d_2640_fe0f)
    //),
    //new Emoji(0x1f3c3, R.drawable.emoji_ios_1f3c3,
    //  new Emoji(new int[] { 0x1f3c3, 0x1f3fb }, R.drawable.emoji_ios_1f3c3_1f3fb),
    //  new Emoji(new int[] { 0x1f3c3, 0x1f3fc }, R.drawable.emoji_ios_1f3c3_1f3fc),
    //  new Emoji(new int[] { 0x1f3c3, 0x1f3fd }, R.drawable.emoji_ios_1f3c3_1f3fd),
    //  new Emoji(new int[] { 0x1f3c3, 0x1f3fe }, R.drawable.emoji_ios_1f3c3_1f3fe),
    //  new Emoji(new int[] { 0x1f3c3, 0x1f3ff }, R.drawable.emoji_ios_1f3c3_1f3ff)
    //),
    new Emoji(0x1f46b, R.drawable.emoji_ios_1f46b),
    //new Emoji(0x1f46d, R.drawable.emoji_ios_1f46d),
    //new Emoji(0x1f46c, R.drawable.emoji_ios_1f46c),
    new Emoji(0x1f491, R.drawable.emoji_ios_1f491),
    new Emoji(new int[] { 0x1f469, 0x200d, 0x2764, 0xfe0f, 0x200d, 0x1f469 }, R.drawable.emoji_ios_1f469_200d_2764_fe0f_200d_1f469),
    new Emoji(new int[] { 0x1f468, 0x200d, 0x2764, 0xfe0f, 0x200d, 0x1f468 }, R.drawable.emoji_ios_1f468_200d_2764_fe0f_200d_1f468),
    //new Emoji(0x1f48f, R.drawable.emoji_ios_1f48f),
    new Emoji(new int[] { 0x1f469, 0x200d, 0x2764, 0xfe0f, 0x200d, 0x1f48b, 0x200d, 0x1f469 }, R.drawable.emoji_ios_1f469_200d_2764_fe0f_200d_1f48b_200d_1f469),
    new Emoji(new int[] { 0x1f468, 0x200d, 0x2764, 0xfe0f, 0x200d, 0x1f48b, 0x200d, 0x1f468 }, R.drawable.emoji_ios_1f468_200d_2764_fe0f_200d_1f48b_200d_1f468),
    //new Emoji(0x1f46a, R.drawable.emoji_ios_1f46a),
    new Emoji(new int[] { 0x1f468, 0x200d, 0x1f469, 0x200d, 0x1f467 }, R.drawable.emoji_ios_1f468_200d_1f469_200d_1f467),
    new Emoji(new int[] { 0x1f468, 0x200d, 0x1f469, 0x200d, 0x1f467, 0x200d, 0x1f466 }, R.drawable.emoji_ios_1f468_200d_1f469_200d_1f467_200d_1f466),
    new Emoji(new int[] { 0x1f468, 0x200d, 0x1f469, 0x200d, 0x1f466, 0x200d, 0x1f466 }, R.drawable.emoji_ios_1f468_200d_1f469_200d_1f466_200d_1f466),
    new Emoji(new int[] { 0x1f468, 0x200d, 0x1f469, 0x200d, 0x1f467, 0x200d, 0x1f467 }, R.drawable.emoji_ios_1f468_200d_1f469_200d_1f467_200d_1f467),
    new Emoji(new int[] { 0x1f469, 0x200d, 0x1f469, 0x200d, 0x1f466 }, R.drawable.emoji_ios_1f469_200d_1f469_200d_1f466),
    new Emoji(new int[] { 0x1f469, 0x200d, 0x1f469, 0x200d, 0x1f467 }, R.drawable.emoji_ios_1f469_200d_1f469_200d_1f467),
    new Emoji(new int[] { 0x1f469, 0x200d, 0x1f469, 0x200d, 0x1f467, 0x200d, 0x1f466 }, R.drawable.emoji_ios_1f469_200d_1f469_200d_1f467_200d_1f466),
    new Emoji(new int[] { 0x1f469, 0x200d, 0x1f469, 0x200d, 0x1f466, 0x200d, 0x1f466 }, R.drawable.emoji_ios_1f469_200d_1f469_200d_1f466_200d_1f466),
    new Emoji(new int[] { 0x1f469, 0x200d, 0x1f469, 0x200d, 0x1f467, 0x200d, 0x1f467 }, R.drawable.emoji_ios_1f469_200d_1f469_200d_1f467_200d_1f467),
    new Emoji(new int[] { 0x1f468, 0x200d, 0x1f468, 0x200d, 0x1f466 }, R.drawable.emoji_ios_1f468_200d_1f468_200d_1f466),
    new Emoji(new int[] { 0x1f468, 0x200d, 0x1f468, 0x200d, 0x1f467 }, R.drawable.emoji_ios_1f468_200d_1f468_200d_1f467),
    new Emoji(new int[] { 0x1f468, 0x200d, 0x1f468, 0x200d, 0x1f467, 0x200d, 0x1f466 }, R.drawable.emoji_ios_1f468_200d_1f468_200d_1f467_200d_1f466),
    new Emoji(new int[] { 0x1f468, 0x200d, 0x1f468, 0x200d, 0x1f466, 0x200d, 0x1f466 }, R.drawable.emoji_ios_1f468_200d_1f468_200d_1f466_200d_1f466),
    new Emoji(new int[] { 0x1f468, 0x200d, 0x1f468, 0x200d, 0x1f467, 0x200d, 0x1f467 }, R.drawable.emoji_ios_1f468_200d_1f468_200d_1f467_200d_1f467),
    new Emoji(new int[] { 0x1f469, 0x200d, 0x1f466 }, R.drawable.emoji_ios_1f469_200d_1f466),
    new Emoji(new int[] { 0x1f469, 0x200d, 0x1f467 }, R.drawable.emoji_ios_1f469_200d_1f467),
    new Emoji(new int[] { 0x1f469, 0x200d, 0x1f467, 0x200d, 0x1f466 }, R.drawable.emoji_ios_1f469_200d_1f467_200d_1f466),
    new Emoji(new int[] { 0x1f469, 0x200d, 0x1f466, 0x200d, 0x1f466 }, R.drawable.emoji_ios_1f469_200d_1f466_200d_1f466),
    new Emoji(new int[] { 0x1f469, 0x200d, 0x1f467, 0x200d, 0x1f467 }, R.drawable.emoji_ios_1f469_200d_1f467_200d_1f467),
    new Emoji(new int[] { 0x1f468, 0x200d, 0x1f466 }, R.drawable.emoji_ios_1f468_200d_1f466),
    new Emoji(new int[] { 0x1f468, 0x200d, 0x1f467 }, R.drawable.emoji_ios_1f468_200d_1f467),
    new Emoji(new int[] { 0x1f468, 0x200d, 0x1f467, 0x200d, 0x1f466 }, R.drawable.emoji_ios_1f468_200d_1f467_200d_1f466),
    new Emoji(new int[] { 0x1f468, 0x200d, 0x1f466, 0x200d, 0x1f466 }, R.drawable.emoji_ios_1f468_200d_1f466_200d_1f466),
    new Emoji(new int[] { 0x1f468, 0x200d, 0x1f467, 0x200d, 0x1f467 }, R.drawable.emoji_ios_1f468_200d_1f467_200d_1f467),
    //new Emoji(0x1f45a, R.drawable.emoji_ios_1f45a),
    new Emoji(0x1f455, R.drawable.emoji_ios_1f455),
    new Emoji(0x1f456, R.drawable.emoji_ios_1f456),
    new Emoji(0x1f454, R.drawable.emoji_ios_1f454),
    new Emoji(0x1f457, R.drawable.emoji_ios_1f457),
    new Emoji(0x1f459, R.drawable.emoji_ios_1f459),
    //new Emoji(0x1f458, R.drawable.emoji_ios_1f458),
    new Emoji(0x1f460, R.drawable.emoji_ios_1f460),
    //new Emoji(0x1f461, R.drawable.emoji_ios_1f461),
    //new Emoji(0x1f462, R.drawable.emoji_ios_1f462),
    //new Emoji(0x1f45e, R.drawable.emoji_ios_1f45e),
    //new Emoji(0x1f45f, R.drawable.emoji_ios_1f45f),
    //new Emoji(0x1f452, R.drawable.emoji_ios_1f452),
    //new Emoji(0x1f3a9, R.drawable.emoji_ios_1f3a9),
    //new Emoji(0x1f393, R.drawable.emoji_ios_1f393),
    new Emoji(0x1f451, R.drawable.emoji_ios_1f451),
    //new Emoji(0x26d1, R.drawable.emoji_ios_26d1),
    //new Emoji(0x1f392, R.drawable.emoji_ios_1f392),
    //new Emoji(0x1f45d, R.drawable.emoji_ios_1f45d),
    //new Emoji(0x1f45b, R.drawable.emoji_ios_1f45b),
    //new Emoji(0x1f45c, R.drawable.emoji_ios_1f45c),
    //new Emoji(0x1f4bc, R.drawable.emoji_ios_1f4bc),
    new Emoji(0x1f453, R.drawable.emoji_ios_1f453),
    //new Emoji(0x1f576, R.drawable.emoji_ios_1f576),
    //new Emoji(0x1f302, R.drawable.emoji_ios_1f302),
    new Emoji(0x2602, R.drawable.emoji_ios_2602)
  };

  @Override @NonNull public Emoji[] getEmojis() {
    return DATA;
  }

  @Override @DrawableRes public int getIcon() {
    return R.drawable.emoji_ios_category_people;
  }
}
