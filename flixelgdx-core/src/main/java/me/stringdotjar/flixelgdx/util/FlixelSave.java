package me.stringdotjar.flixelgdx.util;


import java.util.regex.Pattern;

/**
 * A class to help automate and simplify save game functionality.
 * A wrapper for the LibGDX's Preferences.
 *
 * TODO Documentation, return types, implementation.
 */
public class FlixelSave {
    private static final Pattern INVALID_CHARS = Pattern.compile("[ ~%&\\\\;:\"',<>?#]+");

    // TODO: Explore why this is created in original
    private boolean hasInvalidChars(String str) {
      return INVALID_CHARS.matcher(str).find();
    }

   // TODO: Explore why this is created in original
    private String validate(String str) {
      return INVALID_CHARS.matcher(str).replaceAll("-");
    }

    // TODO: resolveFlixelClasses

    
}
