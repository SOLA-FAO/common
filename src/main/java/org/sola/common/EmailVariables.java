package org.sola.common;

/**
 * Holds the list of email variables, which can be used in the email text or subject.
 * These variables can be found in the text and replaced with appropriate values.
 */
public class EmailVariables {
    /** Full user name (e.g. John Smith) */
    public static final String FULL_USER_NAME = "#{userFullName}";
    /** User name, used for login into the system */
    public static final String USER_NAME = "#{userName}";
    /** Error message text */
    public static final String ERROR_MESSAGE = "#{error}";
    /** Activation URL, used to activate created user account */
    public static final String ACTIVATION_LINK = "#{activationLink}";
    /** Activation page URL, used to activate created user account */
    public static final String ACTIVATION_PAGE = "#{activationPage}";
    /** Activation code for activating created user account */
    public static final String ACTIVATION_CODE = "#{activationCode}";
    /** Password restore URL, used to restore lost or forgotten password */
    public static final String PASSWORD_RESTORE_LINK = "#{passwordRestoreLink}";
    /** Open Tenure claim URL */
    public static final String CLAIM_LINK = "#{claimLink}";
    /** Open Tenure claim number */
    public static final String CLAIM_NUMBER = "#{claimNumber}";
    /** Open Tenure claim challenge URL */
    public static final String CLAIM_CHALLENGE_LINK = "#{challengeLink}";
    /** Open Tenure claim challenge number */
    public static final String CLAIM_CHALLENGE_NUMBER = "#{challengeNumber}";
}
