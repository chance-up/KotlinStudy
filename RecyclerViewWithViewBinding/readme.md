# 개요

## ViewBinding이 있는 RecyclerView예제

1. gradle에 ViewBinding BuildFeature 추가할 때

> Android Studio 버전이 4.0이상이라면 아래와 같이 추가한다.

<pre><code>
// 안드로이드 스튜디오 4.0 이상
android {
    ...
    buildFeatures {
        viewBinding = true
    }
}
</code></pre>

> Android Studio 버전이 4.0이하라면 아래와 같이 추가한다.

<pre><code>
// 안드로이드 스튜디오 3.6 ~ 4.0
android {
    ...
    viewBinding {
        enabled true
    }
}
</code></pre>
