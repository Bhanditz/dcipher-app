package com.adityakamble49.mcrypt.di.module

import com.adityakamble49.mcrypt.di.scope.PerActivity
import com.adityakamble49.mcrypt.interactor.DecryptTextUseCase
import com.adityakamble49.mcrypt.interactor.GetEncryptedTextFromFileUseCase
import com.adityakamble49.mcrypt.interactor.SaveDecryptedTextToFileUseCase
import com.adityakamble49.mcrypt.ui.decrypt.DecryptViewModelFactory
import dagger.Module
import dagger.Provides

/**
 * Decrypt Activity module to provide dependencies
 *
 * @author Aditya Kamble
 * @since 31/12/2017
 */
@Module
class DecryptActivityModule {

    @Provides
    @PerActivity
    fun provideDecryptViewModelFactory(
            getEncryptedTextFromFileUseCase: GetEncryptedTextFromFileUseCase,
            decryptTextUseCase: DecryptTextUseCase,
            saveDecryptedTextToFileUseCase: SaveDecryptedTextToFileUseCase):
            DecryptViewModelFactory = DecryptViewModelFactory(getEncryptedTextFromFileUseCase,
            decryptTextUseCase, saveDecryptedTextToFileUseCase)
}