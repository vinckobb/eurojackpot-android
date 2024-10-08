package com.afterbitestudio.eurojackpot.designsystem.component

import androidx.annotation.StringRes
import androidx.compose.foundation.background
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.stringResource

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EurojackpotTopAppBar(
    @StringRes titleRes: Int,
    modifier: Modifier = Modifier,
) {
    CenterAlignedTopAppBar(
        title = { Text(text = stringResource(id = titleRes)) },
        modifier = modifier
            .background(MaterialTheme.colorScheme.primary)
            .testTag("eurojackpotTopAppBar"),
    )
}