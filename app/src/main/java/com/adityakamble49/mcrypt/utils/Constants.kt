package com.adityakamble49.mcrypt.utils

/**
 * Constants
 *
 * @author Aditya Kamble
 * @since 17/12/2017
 */
class Constants {

    companion object {
        const val ALGORITHM_RSA = "RSA"
        const val AES_KEY = "AES"
        const val AES_CIPHER = "AES/CBC/PKCS5Padding"
        const val TEXT_INTENT = "text/plain"
    }

    object MCryptDir {
        const val MCRYPT_KEYS = "mcrypt_keys"
        const val MCRYPT_ENCRYPTED_FILES = "mcrypt_encrypted_files"
    }

    object MCryptFileFormats {
        const val MCRYPT_KEY = "mck"
        const val MCRYPT_ENCRYPTED_FILE = "mcef"
    }

    object ShareEncryptionType {
        const val TEXT = 0
        const val FILE = 1
    }
}