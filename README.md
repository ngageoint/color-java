# Color Java

#### Color Lib ####

The Color Library was developed at the [National Geospatial-Intelligence Agency (NGA)](http://www.nga.mil/) in collaboration with [BIT Systems](https://www.caci.com/bit-systems/). The government has "unlimited rights" and is releasing this software to increase the impact of government investments by providing developers with the opportunity to take things in new directions. The software use, modification, and distribution rights are stipulated within the [MIT license](http://choosealicense.com/licenses/mit/).

### Pull Requests ###
If you'd like to contribute to this project, please make a pull request. We'll review the pull request and discuss the changes. All pull request contributions to this project will be released under the MIT license.

Software source code previously released under an open source license and then modified by NGA staff is considered a "joint work" (see 17 USC § 101); it is partially copyrighted, partially public domain, and as a whole is protected by the copyrights of the non-government authors and must be released according to the terms of the original open source license.

### About ###

[Color](http://ngageoint.github.io/color-java/) is a Java library providing color representation with support for hex, RBG, arithmetic RBG, HSL, and integer colors.

### Usage ###

View the latest [Javadoc](http://ngageoint.github.io/color-java/docs/api/)

```java

Color rgb = Color.color(154, 205, 50);
Color rgba = Color.color(255, 165, 0, 64);
Color rgbOpacity = Color.color(255, 165, 0, 0.25f);
Color arithmeticRGB = Color.color(1.0f, 0.64705882352f, 0.0f);
Color arithmeticRGBOpacity = Color.color(1.0f, 0.64705882352f, 0.0f,
    0.25098039215f);
Color hex = Color.color("#BA55D3");
Color hexAlpha = Color.color("#D9FFFF00");
Color hexInteger = Color.color(0xFFC000);
Color hexIntegerAlpha = new Color(0x40FFA500);
Color integer = Color.color(16711680);
Color integerAlpha = Color.color(-12303292);
Color hexSingles = Color.color("FF", "C0", "CB");
Color hexSinglesAlpha = Color.color("00", "00", "00", "80");
Color hexSinglesOpacity = Color.color("FF", "A5", "00", 0.25f);
Color hsl = Color.color(new float[] { 300.0f, 1.0f, 0.2509804f });
Color hsla = Color
    .color(new float[] { 60.0f, 1.0f, 0.5f, 0.85098039215f });
Color orangeAlpha = Color.color(ColorConstants.ORANGE, 120);
Color orangeOpacity = Color.color(ColorConstants.ORANGE, 0.25f);

Color color = Color.blue();
color.setAlpha(56);
String hexValue = color.getColorHex();
String hexShorthand = color.getColorHexShorthand();
String hexWithAlpha = color.getColorHexWithAlpha();
String hexShorthandWithAlpha = color.getColorHexShorthandWithAlpha();
int integerValue = color.getColor();
int integerAlphaValue = color.getColorWithAlpha();
int red = color.getRed();
float greenArithmetic = color.getGreenArithmetic();
String blueHex = color.getBlueHex();
String alphaHexShorthand = color.getAlphaHexShorthand();
float opacity = color.getOpacity();
float[] hslValue = color.getHSL();
float hue = color.getHue();
float saturation = color.getSaturation();
float lightness = color.getLightness();

```

### Installation ###

Pull from the [Maven Central Repository](http://search.maven.org/#artifactdetails|mil.nga|color|1.0.0|jar) (JAR, POM, Source, Javadoc)

    <dependency>
        <groupId>mil.nga</groupId>
        <artifactId>color</artifactId>
        <version>1.0.0</version>
    </dependency>

### Build ###

[![Build & Test](https://github.com/ngageoint/color-java/workflows/Build%20&%20Test/badge.svg)](https://github.com/ngageoint/color-java/actions/workflows/build-test.yml)

Build this repository using Eclipse and/or Maven:

    mvn clean install
