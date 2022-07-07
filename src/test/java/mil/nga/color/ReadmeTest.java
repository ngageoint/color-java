package mil.nga.color;

import org.junit.Test;

/**
 * README example tests
 *
 * @author osbornb
 */
public class ReadmeTest {

	/**
	 * Test Color
	 */
	@Test
	public void testColor() {

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

	}

}
