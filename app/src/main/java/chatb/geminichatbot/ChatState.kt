package chatb.geminichatbot

import android.graphics.Bitmap
import chatb.geminichatbot.data.Chat


data class ChatState (
    val chatList: MutableList<Chat> = mutableListOf(),
    val prompt: String = "",
    val bitmap: Bitmap? = null
)