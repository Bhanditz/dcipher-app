package com.adityakamble49.dcipher.di.module

import com.adityakamble49.dcipher.di.scope.PerActivity
import com.adityakamble49.dcipher.ui.FileIntentActivity
import com.adityakamble49.dcipher.ui.MainActivity
import com.adityakamble49.dcipher.ui.decrypt.DecryptActivity
import com.adityakamble49.dcipher.ui.encrypt.EncryptActivity
import com.adityakamble49.dcipher.ui.keys.KeyManagerActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Activity Binding Module used to enable Android Injector in activity
 *
 * @author Aditya Kamble
 * @since 11/12/2017
 */
@Module
abstract class ActivityBindingModule {

    @PerActivity
    @ContributesAndroidInjector(modules = [(CommonActivityModule::class)])
    abstract fun contributeMainActivity(): MainActivity

    @PerActivity
    @ContributesAndroidInjector(modules = [(CommonActivityModule::class),
        (EncryptActivityModule::class)])
    abstract fun contributeEncryptActivity(): EncryptActivity

    @PerActivity
    @ContributesAndroidInjector(modules = [(CommonActivityModule::class),
        (DecryptActivityModule::class)])
    abstract fun contributeDecryptActivity(): DecryptActivity

    @PerActivity
    @ContributesAndroidInjector(modules = [(KeyManagerActivityModule::class)])
    abstract fun contributeKeyManagerActivity(): KeyManagerActivity

    @PerActivity
    @ContributesAndroidInjector
    abstract fun contributeFileIntentActivity(): FileIntentActivity
}